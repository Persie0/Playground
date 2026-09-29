package com.lingq.p055ui.review.views.speaking;

import android.content.Context;
import android.util.AttributeSet;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.textview.MaterialTextView;
import com.linguist.R;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import p225kk.C6716m;
import p278nh.C7776c;
import p513yj.InterfaceC10406h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\f"}, m13365d2 = {"Lcom/lingq/ui/review/views/speaking/MatchTextView;", "Lcom/google/android/material/textview/MaterialTextView;", "Lyj/h;", "listener", "Lsl/e;", "setInteraction", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class MatchTextView extends MaterialTextView {

    /* JADX INFO: renamed from: h */
    public InterfaceC10406h f30470h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatchTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C5207g.m11111f(context, "context");
        List<Integer> list = C6716m.f37937a;
        setTextColor(C6716m.m13333r(R.attr.primaryTextColor, context));
        setTransformationMethod(null);
        setMovementMethod(C7776c.f42711a);
        setHighlightColor(0);
    }

    public final void setInteraction(InterfaceC10406h interfaceC10406h) {
        C5207g.m11111f(interfaceC10406h, "listener");
        this.f30470h = interfaceC10406h;
    }
}
