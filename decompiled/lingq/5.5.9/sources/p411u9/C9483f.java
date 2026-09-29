package p411u9;

import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.common.collect.ImmutableList;
import p479xa.C10145n;
import p479xa.C10151t;

/* JADX INFO: renamed from: u9.f */
/* JADX INFO: loaded from: classes.dex */
public final class C9483f {

    /* JADX INFO: renamed from: a */
    public static final String[] f48688a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    /* JADX INFO: renamed from: a */
    public static CommentFrame m17920a(int i10, C10151t c10151t) {
        int iM19129d = c10151t.m19129d();
        if (c10151t.m19129d() == 1684108385) {
            c10151t.m19125F(8);
            String strM19140o = c10151t.m19140o(iM19129d - 16);
            return new CommentFrame("und", strM19140o, strM19140o);
        }
        C10145n.m19099g("MetadataUtil", "Failed to parse comment attribute: " + AbstractC9478a.m17901a(i10));
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static ApicFrame m17921b(C10151t c10151t) {
        String str;
        int iM19129d = c10151t.m19129d();
        if (c10151t.m19129d() != 1684108385) {
            C10145n.m19099g("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iM19129d2 = c10151t.m19129d() & 16777215;
        if (iM19129d2 == 13) {
            str = "image/jpeg";
        } else {
            str = iM19129d2 == 14 ? "image/png" : null;
        }
        if (str == null) {
            C0141b.m620p("Unrecognized cover art flags: ", iM19129d2, "MetadataUtil");
            return null;
        }
        c10151t.m19125F(4);
        int i10 = iM19129d - 16;
        byte[] bArr = new byte[i10];
        c10151t.m19127b(bArr, 0, i10);
        return new ApicFrame(str, null, 3, bArr);
    }

    /* JADX INFO: renamed from: c */
    public static TextInformationFrame m17922c(int i10, C10151t c10151t, String str) {
        int iM19129d = c10151t.m19129d();
        if (c10151t.m19129d() == 1684108385 && iM19129d >= 22) {
            c10151t.m19125F(10);
            int iM19150y = c10151t.m19150y();
            if (iM19150y > 0) {
                String strM761g = C0166e.m761g("", iM19150y);
                int iM19150y2 = c10151t.m19150y();
                if (iM19150y2 > 0) {
                    strM761g = strM761g + "/" + iM19150y2;
                }
                return new TextInformationFrame(str, null, ImmutableList.m9064b0(strM761g));
            }
        }
        C10145n.m19099g("MetadataUtil", "Failed to parse index/count attribute: " + AbstractC9478a.m17901a(i10));
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static TextInformationFrame m17923d(int i10, C10151t c10151t, String str) {
        int iM19129d = c10151t.m19129d();
        if (c10151t.m19129d() == 1684108385) {
            c10151t.m19125F(8);
            return new TextInformationFrame(str, null, ImmutableList.m9064b0(c10151t.m19140o(iM19129d - 16)));
        }
        C10145n.m19099g("MetadataUtil", "Failed to parse text attribute: " + AbstractC9478a.m17901a(i10));
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static Id3Frame m17924e(int i10, String str, C10151t c10151t, boolean z10, boolean z11) {
        int iM17925f = m17925f(c10151t);
        if (z11) {
            iM17925f = Math.min(1, iM17925f);
        }
        if (iM17925f >= 0) {
            return z10 ? new TextInformationFrame(str, null, ImmutableList.m9064b0(Integer.toString(iM17925f))) : new CommentFrame("und", str, Integer.toString(iM17925f));
        }
        C10145n.m19099g("MetadataUtil", "Failed to parse uint8 attribute: " + AbstractC9478a.m17901a(i10));
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static int m17925f(C10151t c10151t) {
        c10151t.m19125F(4);
        if (c10151t.m19129d() == 1684108385) {
            c10151t.m19125F(8);
            return c10151t.m19145t();
        }
        C10145n.m19099g("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
