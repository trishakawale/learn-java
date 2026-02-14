class StringBufferInsertDelete {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("JavaProgramming");
        sb.insert(4, " ");
        sb.delete(5, 16);
        System.out.println(sb);
    }
}
