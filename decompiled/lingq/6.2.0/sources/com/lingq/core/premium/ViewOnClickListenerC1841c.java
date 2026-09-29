package com.lingq.core.premium;

import android.view.View;
import com.lingq.core.domain.model.user.LingQsOffer;
import org.joda.time.DateTime;
import p000.ce5;
import p000.lda;
import p000.wfb;

/* JADX INFO: renamed from: com.lingq.core.premium.c */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC1841c implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LingQsOfferFragment f22417a;

    public ViewOnClickListenerC1841c(LingQsOfferFragment lingQsOfferFragment) {
        this.f22417a = lingQsOfferFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ce5 ce5Var = (ce5) this.f22417a.f22347C0.getValue();
        long jMo18366b = new DateTime().mo18366b() / 1000;
        wfb.m23926u(lda.m16103C(ce5Var), null, null, new LingQsOfferViewModel$getMoreLingQs$1(ce5Var, LingQsOffer.LimitOffer, jMo18366b, null), 3);
    }
}
