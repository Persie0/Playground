package p000;

import android.speech.tts.Voice;
import android.view.View;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.lingq.core.domain.model.language.DictionaryLocale;
import com.lingq.core.domain.model.language.Language;
import com.lingq.core.domain.model.token.TextToSpeechVoice;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.core.network.api.result.ResultPlaylistFolder;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class yd7 implements Comparator {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ yd7 f69695b = new yd7(13);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ yd7 f69696c = new yd7(14);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ yd7 f69697d = new yd7(17);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69698a;

    public /* synthetic */ yd7(int i) {
        this.f69698a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f69698a) {
            case 0:
                return ss5.m21718o(Integer.valueOf(((ResultPlaylistFolder) obj).f21460a), Integer.valueOf(((ResultPlaylistFolder) obj2).f21460a));
            case 1:
                return ss5.m21718o(((DictionaryLocale) obj).f19022b, ((DictionaryLocale) obj2).f19022b);
            case 2:
                TextToSpeechVoice textToSpeechVoice = (TextToSpeechVoice) obj;
                TextToSpeechVoice textToSpeechVoice2 = (TextToSpeechVoice) obj2;
                return ss5.m21718o(AbstractC3393o1.m17732g(!textToSpeechVoice.f19574e.contains("default") ? 1 : 0, textToSpeechVoice.f19571b), (!textToSpeechVoice2.f19574e.contains("default") ? 1 : 0) + textToSpeechVoice2.f19571b);
            case 3:
                return ss5.m21718o((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 4:
                return ss5.m21718o((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 5:
                return ss5.m21718o(((vq9) obj).f65792a, ((vq9) obj2).f65792a);
            case 6:
                return ss5.m21718o(((xq9) obj).f68546a, ((xq9) obj2).f68546a);
            case 7:
                return ss5.m21718o(Integer.valueOf(((TokenMeaning) obj2).f19598e), Integer.valueOf(((TokenMeaning) obj).f19598e));
            case 8:
                return ss5.m21718o(Integer.valueOf(((TokenMeaning) obj2).f19598e), Integer.valueOf(((TokenMeaning) obj).f19598e));
            case 9:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 10:
                return ss5.m21718o(((Voice) obj).getName(), ((Voice) obj2).getName());
            case 11:
                return ss5.m21718o(((Language) obj).f19029f, ((Language) obj2).f19029f);
            case 12:
                return ss5.m21718o(((zbb) obj).f71322a, ((zbb) obj2).f71322a);
            case 13:
                return ((Scope) obj).f11656b.compareTo(((Scope) obj2).f11656b);
            case 14:
                Feature feature = (Feature) obj2;
                Feature feature2 = (Feature) obj;
                return !feature2.f11641a.equals(feature.f11641a) ? feature2.f11641a.compareTo(feature.f11641a) : Long.compare(feature2.m5279r(), feature.m5279r());
            case 15:
                return ((Scope) obj).f11656b.compareTo(((Scope) obj2).f11656b);
            case 16:
                return ((Integer) ((Map.Entry) obj).getValue()).compareTo((Integer) ((Map.Entry) obj2).getValue());
            default:
                return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
        }
    }
}
