package Helper;

import java.util.List;
import java.util.Random;

public class PromptsHelper {
    private static final List<String> prompts = List.of(
            "Write a viral pop song about self-love, resilience, and freedom. Catchy chorus, vivid metaphors, modern slang. Uplifting, emotional, perfect for TikTok, radio, and stadiums.",
            "Write a viral dance-pop song about joy and celebration. Upbeat tempo, catchy chorus, energetic vibe, modern slang. Perfect for dance floors, TikTok trends, and radio airplay.",
            "Write a viral pop anthem about overcoming obstacles and embracing self-worth. Empowering lyrics, catchy chorus, upbeat energy, perfect for TikTok, radio, and concerts. Include modern slang and metaphors.",
            "Write a viral dance-pop song about chasing dreams and believing in yourself. Catchy beat, uplifting lyrics, vibrant chorus, modern slang. Perfect for TikTok trends, radio airplay, and stadium energy.",
            "Write a viral pop song about personal growth, confidence, and shining bright. Catchy melody, uplifting vibe, emotional hook, relatable metaphors, perfect for TikTok, radio, and major playlists.",
            "Write a viral pop anthem about freedom and letting go of the past. Catchy chorus, emotional depth, modern slang, and vivid imagery. Energetic, empowering, and perfect for TikTok and radio hits.",
            "Write a viral dance-pop song about enjoying life and embracing who you are. Catchy beat, feel-good lyrics, empowering chorus, full of modern slang. Perfect for TikTok, radio, and global hit charts.",
            "Write a viral pop anthem about empowerment, self-love, and resilience. Catchy melody, emotional hook, vibrant metaphors, modern slang. Perfect for TikTok, radio, and live performances.",
            "Write a viral dance-pop song about positivity and never giving up. Catchy chorus, upbeat tempo, inspiring lyrics, full of energy and modern slang. Perfect for radio hits and viral TikTok moments.",
            "Write a viral pop song about finding your inner strength and believing in yourself. Catchy, upbeat chorus, empowering lyrics, modern metaphors, and slang. Perfect for TikTok, radio, and festivals.",
            "Write a viral pop anthem about self-empowerment and breaking free from negativity. Uplifting chorus, catchy beat, vibrant metaphors, modern slang, perfect for TikTok trends and radio stations.",
            "Write a viral dance-pop song about living life to the fullest and celebrating individuality. Catchy melody, positive lyrics, empowering chorus, energetic vibe. Perfect for TikTok and global airplay.",
            "Write a viral pop song about chasing your dreams fearlessly. Catchy hook, relatable lyrics, vivid metaphors, upbeat tempo. Perfect for YouTube, TikTok, and radio hits.",
            "Write a viral dance-pop anthem about celebrating small victories. Energetic beat, catchy chorus, feel-good vibes. Perfect for YouTube shorts, dance trends, and party playlists.",
            "Write a viral pop song about love at first sight. Memorable hook, emotional lyrics, dreamy metaphors, modern slang. Designed for YouTube virality and TikTok love stories.",
            "Write a viral pop anthem about new beginnings and fresh starts. Uplifting lyrics, catchy chorus, emotional build-up. Perfect for YouTube motivational videos and TikTok glow-up trends.",
            "Write a viral dance-pop track about unforgettable nights with friends. Party vibes, catchy melodies, vibrant slang. Perfect for YouTube music videos, TikTok party clips, and club playlists.",
            "Write a viral pop song about turning pain into power. Emotional storytelling, catchy chorus, empowering metaphors. Perfect for YouTube inspirational videos and TikTok challenges.",
            "Write a viral dance-pop song about being unstoppable. Catchy beat, fierce lyrics, high-energy chorus, modern slang. Designed for YouTube virality and TikTok dance trends.",
            "Write a viral pop song about summer love and unforgettable adventures. Upbeat, catchy chorus, colorful imagery. Perfect for YouTube summer playlists and TikTok travel videos.",
            "Write a viral pop anthem about breaking free from toxic relationships. Empowering lyrics, catchy chorus, vivid metaphors. Perfect for YouTube emotional storytelling and TikTok glow-up clips.",
            "Write a viral dance-pop song about feeling alive and limitless. Euphoric beats, catchy melodies, inspirational metaphors. Made for YouTube big-stage vibes and TikTok adrenaline trends."
    );

    public static String getRandomPrompt() {
        Random random = new Random();
        int index = random.nextInt(prompts.size());
        return prompts.get(index);
    }
}
