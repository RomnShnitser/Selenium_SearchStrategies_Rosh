
publi  c class A_Main_IterableString {

    @SuppressWarnings("unlikely-arg-type")
    public static void main(String[] args) {

        //String str = "hello world";

        Character[] str = new Character[0];
        for(Character c: str) {
			System.out.print(c + " ");
		}

        String text = "Hello World";

        //IterableString sIt = new IterableString(text);
        String[] sAr = text.split(" ");

        StringIterator siter = new StringIterator(sAr);

        while(siter.hasNext()==true) {


            System.out.print(siter.next() + " ");
        }

//		for(Character c: s) {
//		System.out.print(c + " ");
//	}


    }

}
