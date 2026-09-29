package com.lingq.p055ui.commons.vocabulary;

import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.linguist.R;
import p036c0.C1648d;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5336s0;
import p187j1.C6403c;
import p230l0.C7204a;
import p338qd.C8584v;
import p387t0.C9137c;
import p387t0.C9159n;
import p387t0.C9170v;
import p444w0.AbstractC9790b;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class ComposableSingletons$VocabularyTokenItemKt {

    /* JADX INFO: renamed from: a */
    public static final ComposableLambdaImpl f22467a = C7204a.m14523c(-774649504, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.commons.vocabulary.ComposableSingletons$VocabularyTokenItemKt$lambda-1$1
        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a, Integer num) {
            InterfaceC0476a interfaceC0476a2 = interfaceC0476a;
            if ((num.intValue() & 11) == 2 && interfaceC0476a2.mo1642m()) {
                interfaceC0476a2.mo1650q();
            } else {
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
                AbstractC9790b abstractC9790bM13028a = C6403c.m13028a(R.drawable.ic_audio_tts, interfaceC0476a2);
                InterfaceC0500b interfaceC0500bM1507d = SizeKt.m1507d();
                long jM5355n = ((C1648d) interfaceC0476a2.mo1648p(ColorSchemeKt.f2735a)).m5355n();
                ImageKt.m1415a(abstractC9790bM13028a, "Play word tts", interfaceC0500bM1507d, null, null, 0.0f, new C9170v(Build.VERSION.SDK_INT >= 29 ? C9159n.f47687a.m17478a(jM5355n, 5) : new PorterDuffColorFilter(C8584v.m16780C(jM5355n), C9137c.m17404b(5))), interfaceC0476a2, 440, 56);
            }
            return C9072e.f47360a;
        }
    }, false);
}
