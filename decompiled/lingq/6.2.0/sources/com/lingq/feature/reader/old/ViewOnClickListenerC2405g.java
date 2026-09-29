package com.lingq.feature.reader.old;

import android.view.View;
import android.widget.PopupWindow;
import androidx.lifecycle.Lifecycle$State;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import p000.fa4;
import p000.lda;
import p000.wfb;

/* JADX INFO: renamed from: com.lingq.feature.reader.old.g */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC2405g implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f29184a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderFragment f29185b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Integer f29186c;

    public /* synthetic */ ViewOnClickListenerC2405g(ReaderFragment readerFragment, Integer num, int i) {
        this.f29184a = i;
        this.f29185b = readerFragment;
        this.f29186c = num;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f29184a;
        ReaderFragment readerFragment = this.f29185b;
        Integer num = this.f29186c;
        switch (i) {
            case 0:
                PopupWindow popupWindow = readerFragment.f28223G0;
                if (popupWindow == null) {
                    fa4.m11636J("popupSettings");
                    throw null;
                }
                popupWindow.dismiss();
                if (readerFragment.f5709m0.f66586d.isAtLeast(Lifecycle$State.STARTED)) {
                    if (readerFragment.m9290W0().m9329i3(num.intValue())) {
                        C2412n c2412nM9290W0 = readerFragment.m9290W0();
                        int iIntValue = num.intValue();
                        c2412nM9290W0.getClass();
                        wfb.m23926u(lda.m16103C(c2412nM9290W0), null, null, new ReaderViewModel$showBuyPremiumLesson$1(c2412nM9290W0, iIntValue, null), 3);
                        return;
                    }
                    ViewPager2 viewPager2 = readerFragment.m9288U0().f66709o;
                    ((ArrayList) viewPager2.f7120c.f42294b).remove(readerFragment.f28227K0);
                    readerFragment.m9290W0().f29328X.mo4677k(num);
                    return;
                }
                return;
            default:
                PopupWindow popupWindow2 = readerFragment.f28223G0;
                if (popupWindow2 == null) {
                    fa4.m11636J("popupSettings");
                    throw null;
                }
                popupWindow2.dismiss();
                if (readerFragment.f5709m0.f66586d.isAtLeast(Lifecycle$State.STARTED)) {
                    if (readerFragment.m9290W0().m9329i3(num.intValue())) {
                        C2412n c2412nM9290W1 = readerFragment.m9290W0();
                        int iIntValue2 = num.intValue();
                        c2412nM9290W1.getClass();
                        wfb.m23926u(lda.m16103C(c2412nM9290W1), null, null, new ReaderViewModel$showBuyPremiumLesson$1(c2412nM9290W1, iIntValue2, null), 3);
                        return;
                    }
                    ViewPager2 viewPager3 = readerFragment.m9288U0().f66709o;
                    ((ArrayList) viewPager3.f7120c.f42294b).remove(readerFragment.f28227K0);
                    readerFragment.m9290W0().f29328X.mo4677k(num);
                    return;
                }
                return;
        }
    }
}
