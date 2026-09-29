package bi;

import android.support.v4.media.AbstractC0140a;
import com.lingq.entity.TtsUtterance;
import com.lingq.shared.uimodel.TextToSpeechTokenUtterance;
import com.lingq.shared.uimodel.TextToSpeechVoice;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.flow.C7136q;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: bi.m5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1485m5 extends AbstractC0140a {
    /* JADX INFO: renamed from: k0 */
    public abstract Object mo5101k0(String str, InterfaceC9968c<? super TextToSpeechVoice> interfaceC9968c);

    /* JADX INFO: renamed from: l0 */
    public abstract Object mo5102l0(String str, InterfaceC9968c<? super List<TextToSpeechVoice>> interfaceC9968c);

    /* JADX INFO: renamed from: m0 */
    public abstract Object mo5103m0(String str, InterfaceC9968c<? super TextToSpeechTokenUtterance> interfaceC9968c);

    /* JADX INFO: renamed from: n0 */
    public abstract Object mo5104n0(ArrayList arrayList, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: o0 */
    public abstract C7136q mo5105o0(String str);

    /* JADX INFO: renamed from: p0 */
    public abstract Object mo5106p0(ArrayList arrayList, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: q0 */
    public abstract Object mo5107q0(List<TtsUtterance> list, InterfaceC9968c<? super C9072e> interfaceC9968c);
}
