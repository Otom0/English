public class Main {
    public static void main(String[] args) {
        String text = "The house they lived in then, Park House, was near the Queen's house at Sandringham, so Diana grew up almost 'next door' to the Royal Family. Diana often visited them at Sandringham House when she was a little girl. The Queen's most important homes are at Buckingham Palace in London, and Windsor Castle just to the west of London. But she also spends time at Balmoral Castle in Scotland, and at Sandringham House, which is in the east of England.\n" +
                "\n" +
                "Later, people called Diana 'a fairy-tale princess'. But her story was often a sad one too. Her parents had the son that they wanted so much in 1964 - they called him Charles. But their marriage was unhappy, and soon terrible fights began. When Diana was only six, her mother, Frances, ran away with another man, Peter Shand Kydd.\n" +
                "\n" +
                "For a long time, the children could only visit their mother at weekends. Frances very much wanted her children to live with her. But their father was against the idea, and so they stayed at Park House with him. Other women came to the house to look after the children, but they didn't usually stay long. The children made trouble for them - they threw their clothes out of the window, or locked them in the toilet! The two smallest children, Charles and Diana, were really unhappy. Each night in bed, Charles cried for his mother, and Diana lay there alone, listening to him. She was too frightened of the dark house to get out of bed and go to him.";

        String[] sentences = text.split("\\s+");
        for (int i = 0; i < sentences.length; i++) {
            System.out.println(sentences[i]);
        }
    }
}
