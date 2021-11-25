package test.programmers.level2;

public class 스킬트리 {

    public static int basic(String skill, String[] skill_trees) {

        char[] arr = skill.toCharArray();

        int count = skill_trees.length;

        for (String skill_tree : skill_trees) {
            System.out.println("skill_tree = " + skill_tree);
            int idx = 0;
            boolean posible = true;

            for (int i = 0; i < skill_tree.length(); i++) {
                if (!posible) {
                    break;
                }
                System.out.println("idx = " + idx);
                System.out.println("count = " + count);
                System.out.println("skill_tree.charAt(i) = " + skill_tree.charAt(i));

                for (int j = idx; j < arr.length; j++) {

                    if (arr[j] == skill_tree.charAt(i)) {

                        if (j == idx) {
                            System.out.println("j == idx");
                            idx++;
                            break;
                        } else if (j > idx) {
                            count--;
                            System.out.println("j > idx");
                            posible = false;
                            break;
                        }
                    }
                }
            }
        }
        return count;
    }

    public static int basicV2(String skill, String[] skill_trees) {

        int count = 0;

        for (String skill_tree : skill_trees) {

            boolean possible = posOrImpos(skill, skill_tree);
            if (possible) {
                count++;
            }

        }
        return count;
    }

    public static boolean posOrImpos(String skill, String skill_tree) {

        int nextSkillIdx = 0;

        for (int i = 0; i < skill_tree.length(); i++) {

            int index = skill.indexOf(skill_tree.charAt(i));

            if (index == nextSkillIdx) {
                nextSkillIdx++;
            } else if (index > nextSkillIdx) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
        String skill = "CBD";

        int basic = basicV2(skill, skill_trees);
        System.out.println("basic = " + basic);

    }
}
