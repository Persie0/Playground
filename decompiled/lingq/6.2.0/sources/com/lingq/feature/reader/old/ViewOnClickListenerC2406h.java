package com.lingq.feature.reader.old;

import android.view.View;
import android.widget.PopupWindow;
import p000.ea7;
import p000.fa4;
import p000.lda;
import p000.wfb;

/* JADX INFO: renamed from: com.lingq.feature.reader.old.h */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC2406h implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ReaderFragment f29187a;

    public ViewOnClickListenerC2406h(ReaderFragment readerFragment) {
        this.f29187a = readerFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ReaderFragment readerFragment = this.f29187a;
        PopupWindow popupWindow = readerFragment.f28223G0;
        if (popupWindow == null) {
            fa4.m11636J("popupSettings");
            throw null;
        }
        popupWindow.dismiss();
        readerFragment.m9290W0().m9328h3(ea7.f36941i);
        C2412n c2412nM9290W0 = readerFragment.m9290W0();
        c2412nM9290W0.getClass();
        wfb.m23926u(lda.m16103C(c2412nM9290W0), null, null, new ReaderViewModel$navigateLessonEdit$1(c2412nM9290W0, null), 3);
    }
}
