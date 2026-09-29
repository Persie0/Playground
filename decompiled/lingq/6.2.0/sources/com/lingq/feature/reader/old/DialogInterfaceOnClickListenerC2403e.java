package com.lingq.feature.reader.old;

import android.content.DialogInterface;
import com.lingq.core.analytics.C1240a;
import p000.fa4;
import p000.hm5;
import p000.lda;
import p000.wfb;

/* JADX INFO: renamed from: com.lingq.feature.reader.old.e */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogInterfaceOnClickListenerC2403e implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ReaderFragment f29182a;

    public DialogInterfaceOnClickListenerC2403e(ReaderFragment readerFragment) {
        this.f29182a = readerFragment;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        ReaderFragment readerFragment = this.f29182a;
        hm5 hm5Var = readerFragment.f28228L0;
        if (hm5Var == null) {
            fa4.m11636J("analytics");
            throw null;
        }
        ((C1240a) hm5Var).m7025f("Lesson audio generated", null);
        C2412n c2412nM9290W0 = readerFragment.m9290W0();
        c2412nM9290W0.getClass();
        wfb.m23926u(lda.m16103C(c2412nM9290W0), null, null, new ReaderViewModel$generateLesson$1(2, null), 3);
    }
}
