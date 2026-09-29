package com.lingq.feature.reader.old;

import android.widget.CompoundButton;
import p000.bh4;
import p000.lda;
import p000.wfb;

/* JADX INFO: renamed from: com.lingq.feature.reader.old.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C2404f implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ReaderFragment f29183a;

    public C2404f(ReaderFragment readerFragment) {
        this.f29183a = readerFragment;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        compoundButton.getClass();
        if (compoundButton.isPressed()) {
            bh4[] bh4VarArr = ReaderFragment.f28218P0;
            C2412n c2412nM9290W0 = this.f29183a.m9290W0();
            c2412nM9290W0.getClass();
            wfb.m23926u(lda.m16103C(c2412nM9290W0), c2412nM9290W0.f29301O, null, new ReaderViewModel$setMoveBlueWordsToKnown$1(c2412nM9290W0, z, null), 2);
        }
    }
}
