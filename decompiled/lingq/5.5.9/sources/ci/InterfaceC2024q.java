package ci;

import com.lingq.shared.uimodel.TextToSpeechAppVoice;
import com.lingq.shared.uimodel.TextToSpeechTokenUtterance;
import com.lingq.shared.uimodel.TextToSpeechVoice;
import java.util.Set;
import kotlinx.coroutines.flow.C7136q;
import kotlinx.coroutines.flow.InterfaceC7116c;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: ci.q */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2024q {
    /* JADX INFO: renamed from: a */
    InterfaceC7116c mo6170a(String str);

    /* JADX INFO: renamed from: b */
    C7136q mo6171b(String str, boolean z10);

    /* JADX INFO: renamed from: c */
    C7136q mo6172c(String str, String str2, TextToSpeechAppVoice textToSpeechAppVoice);

    /* JADX INFO: renamed from: d */
    Object mo6173d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: e */
    Object mo6174e(String str, InterfaceC9968c<? super TextToSpeechVoice> interfaceC9968c);

    /* JADX INFO: renamed from: f */
    Object mo6175f(String str, String str2, TextToSpeechAppVoice textToSpeechAppVoice, InterfaceC9968c<? super String> interfaceC9968c);

    /* JADX INFO: renamed from: g */
    Object mo6176g(String str, InterfaceC9968c<? super TextToSpeechAppVoice> interfaceC9968c);

    /* JADX INFO: renamed from: h */
    C7136q mo6177h(String str, Set set, TextToSpeechAppVoice textToSpeechAppVoice);

    /* JADX INFO: renamed from: i */
    Object mo6178i(String str, String str2, TextToSpeechAppVoice textToSpeechAppVoice, InterfaceC9968c<? super TextToSpeechTokenUtterance> interfaceC9968c);
}
