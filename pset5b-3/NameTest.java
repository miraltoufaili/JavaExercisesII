public class NameTest
{ 
    public static void main(String[] args)
    {
        Name teacher = new Name ("Henry", 'H', "Leitner");
        Name tf = new Name ("Justin", "Devuono");
        System.out.println(teacher.getNormalOrder());
        System.out.println(teacher.getReverseOrder());
        System.out.println(teacher.getInitials());
        System.out.println();
        System.out.printf("%s \n%s  \n%s", tf.getNormalOrder(), tf.getReverseOrder(), tf.getInitials());
        
    }
}