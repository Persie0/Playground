package p511yh;

import com.lingq.entity.TtsUtterance;
import com.lingq.shared.network.result.ResultTtsUtterance;
import com.lingq.shared.uimodel.TextToSpeechTokenUtterance;
import dm.C5207g;
import java.util.Locale;
import kotlin.text.C7076b;

/* JADX INFO: renamed from: yh.d */
/* JADX INFO: loaded from: classes.dex */
public final class C10367d {
    /* JADX INFO: renamed from: a */
    public static final TtsUtterance m19388a(ResultTtsUtterance resultTtsUtterance, Locale locale, String str) {
        C5207g.m11111f(resultTtsUtterance, "<this>");
        C5207g.m11111f(str, "text");
        return new TtsUtterance(TextToSpeechTokenUtterance.C3401a.m9701a(locale, resultTtsUtterance.f19026f.f18438b, str, resultTtsUtterance.f19023c, resultTtsUtterance.f19024d), resultTtsUtterance.f19021a, resultTtsUtterance.f19022b, C7076b.m14277B3(str).toString());
    }
}
