package com.lingq.commons.controllers;

import com.lingq.shared.uimodel.LocalTextToSpeechVoice;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.flow.InterfaceC7116c;
import p464wl.InterfaceC9968c;

/* JADX INFO: renamed from: com.lingq.commons.controllers.c */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3275c {

    /* JADX INFO: renamed from: com.lingq.commons.controllers.c$a */
    public static final class a {
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m9347b(InterfaceC3275c interfaceC3275c, String str, String str2, boolean z10, float f3, int i10) {
            if ((i10 & 4) != 0) {
                z10 = false;
            }
            if ((i10 & 8) != 0) {
                f3 = 1.0f;
            }
            interfaceC3275c.mo9343o(str, str2, z10, f3);
        }
    }

    /* JADX INFO: renamed from: E0 */
    void mo9335E0(String str, Set<String> set);

    /* JADX INFO: renamed from: K */
    void mo9336K();

    /* JADX INFO: renamed from: M1 */
    void mo9337M1(int i10, double d10, Double d11, float f3);

    /* JADX INFO: renamed from: O1 */
    void mo9338O1(String str);

    /* JADX INFO: renamed from: c */
    InterfaceC7116c<Long> mo9339c();

    /* JADX INFO: renamed from: h0 */
    Object mo9342h0(String str, InterfaceC9968c<? super List<LocalTextToSpeechVoice>> interfaceC9968c);

    /* JADX INFO: renamed from: o */
    void mo9343o(String str, String str2, boolean z10, float f3);

    /* JADX INFO: renamed from: t */
    InterfaceC7116c<Boolean> mo9344t();
}
