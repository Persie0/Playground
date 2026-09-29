package com.lingq.p055ui.review.views.speaking;

import ae.C0062b;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import com.lingq.p055ui.review.views.speaking.MatchPairView;
import com.linguist.R;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import mo.C7661i;
import p225kk.C6716m;
import p408u6.ViewOnClickListenerC9466e;
import p513yj.C10399a;
import p513yj.C10403e;
import p513yj.C10404f;
import p513yj.InterfaceC10400b;
import ph.C8302i4;
import si.ViewOnClickListenerC9029m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¨\u0006\u0010"}, m13365d2 = {"Lcom/lingq/ui/review/views/speaking/MatchPairView;", "Landroid/widget/FrameLayout;", "", "Lyj/a;", "data", "Lsl/e;", "setup", "Lyj/b;", "listener", "setListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class MatchPairView extends FrameLayout {

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ int f30458l = 0;

    /* JADX INFO: renamed from: a */
    public final C8302i4 f30459a;

    /* JADX INFO: renamed from: b */
    public List<C10399a> f30460b;

    /* JADX INFO: renamed from: c */
    public final HashSet<String> f30461c;

    /* JADX INFO: renamed from: d */
    public String f30462d;

    /* JADX INFO: renamed from: e */
    public MaterialCardView f30463e;

    /* JADX INFO: renamed from: f */
    public final int f30464f;

    /* JADX INFO: renamed from: g */
    public final int f30465g;

    /* JADX INFO: renamed from: h */
    public final int f30466h;

    /* JADX INFO: renamed from: i */
    public final int f30467i;

    /* JADX INFO: renamed from: j */
    public InterfaceC10400b f30468j;

    /* JADX INFO: renamed from: k */
    public int f30469k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatchPairView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C5207g.m11111f(context, "context");
        this.f30460b = EmptyList.f38032a;
        this.f30461c = new HashSet<>();
        List<Integer> list = C6716m.f37937a;
        this.f30464f = C6716m.m13333r(R.attr.tertiaryTextColor, context);
        this.f30465g = C6716m.m13333r(R.attr.blueTint, context);
        this.f30466h = C6716m.m13333r(R.attr.redTint, context);
        this.f30467i = C6716m.m13333r(R.attr.greenTint, context);
        final int i10 = 0;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.view_match_pair, (ViewGroup) this, false);
        addView(viewInflate);
        int i11 = R.id.card1;
        MaterialCardView materialCardView = (MaterialCardView) C0062b.m298P0(viewInflate, R.id.card1);
        if (materialCardView != null) {
            i11 = R.id.card2;
            MaterialCardView materialCardView2 = (MaterialCardView) C0062b.m298P0(viewInflate, R.id.card2);
            if (materialCardView2 != null) {
                i11 = R.id.card3;
                MaterialCardView materialCardView3 = (MaterialCardView) C0062b.m298P0(viewInflate, R.id.card3);
                if (materialCardView3 != null) {
                    i11 = R.id.card4;
                    MaterialCardView materialCardView4 = (MaterialCardView) C0062b.m298P0(viewInflate, R.id.card4);
                    if (materialCardView4 != null) {
                        i11 = R.id.card5;
                        MaterialCardView materialCardView5 = (MaterialCardView) C0062b.m298P0(viewInflate, R.id.card5);
                        if (materialCardView5 != null) {
                            i11 = R.id.card6;
                            MaterialCardView materialCardView6 = (MaterialCardView) C0062b.m298P0(viewInflate, R.id.card6);
                            if (materialCardView6 != null) {
                                i11 = R.id.tvCard1;
                                MaterialTextView materialTextView = (MaterialTextView) C0062b.m298P0(viewInflate, R.id.tvCard1);
                                if (materialTextView != null) {
                                    i11 = R.id.tvCard2;
                                    MaterialTextView materialTextView2 = (MaterialTextView) C0062b.m298P0(viewInflate, R.id.tvCard2);
                                    if (materialTextView2 != null) {
                                        i11 = R.id.tvCard3;
                                        MaterialTextView materialTextView3 = (MaterialTextView) C0062b.m298P0(viewInflate, R.id.tvCard3);
                                        if (materialTextView3 != null) {
                                            i11 = R.id.tvCard4;
                                            MaterialTextView materialTextView4 = (MaterialTextView) C0062b.m298P0(viewInflate, R.id.tvCard4);
                                            if (materialTextView4 != null) {
                                                i11 = R.id.tvCard5;
                                                MaterialTextView materialTextView5 = (MaterialTextView) C0062b.m298P0(viewInflate, R.id.tvCard5);
                                                if (materialTextView5 != null) {
                                                    i11 = R.id.tvCard6;
                                                    MaterialTextView materialTextView6 = (MaterialTextView) C0062b.m298P0(viewInflate, R.id.tvCard6);
                                                    if (materialTextView6 != null) {
                                                        i11 = R.id.viewBottom;
                                                        if (((LinearLayout) C0062b.m298P0(viewInflate, R.id.viewBottom)) != null) {
                                                            i11 = R.id.viewMiddle;
                                                            if (((LinearLayout) C0062b.m298P0(viewInflate, R.id.viewMiddle)) != null) {
                                                                i11 = R.id.viewTop;
                                                                if (((LinearLayout) C0062b.m298P0(viewInflate, R.id.viewTop)) != null) {
                                                                    final C8302i4 c8302i4 = new C8302i4(materialCardView, materialCardView2, materialCardView3, materialCardView4, materialCardView5, materialCardView6, materialTextView, materialTextView2, materialTextView3, materialTextView4, materialTextView5, materialTextView6);
                                                                    this.f30459a = c8302i4;
                                                                    materialCardView.setOnClickListener(new View.OnClickListener(this) { // from class: yj.c

                                                                        /* JADX INFO: renamed from: b */
                                                                        public final /* synthetic */ MatchPairView f52200b;

                                                                        {
                                                                            this.f52200b = this;
                                                                        }

                                                                        @Override // android.view.View.OnClickListener
                                                                        public final void onClick(View view) {
                                                                            int i12 = i10;
                                                                            C8302i4 c8302i5 = c8302i4;
                                                                            MatchPairView matchPairView = this.f52200b;
                                                                            switch (i12) {
                                                                                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                                                                    int i13 = MatchPairView.f30458l;
                                                                                    C5207g.m11111f(matchPairView, "this$0");
                                                                                    C5207g.m11111f(c8302i5, "$this_with");
                                                                                    MaterialCardView materialCardView7 = c8302i5.f44895a;
                                                                                    C5207g.m11110e(materialCardView7, "card1");
                                                                                    MaterialTextView materialTextView7 = c8302i5.f44901g;
                                                                                    C5207g.m11110e(materialTextView7, "tvCard1");
                                                                                    matchPairView.m10310a(materialCardView7, materialTextView7);
                                                                                    break;
                                                                                default:
                                                                                    int i14 = MatchPairView.f30458l;
                                                                                    C5207g.m11111f(matchPairView, "this$0");
                                                                                    C5207g.m11111f(c8302i5, "$this_with");
                                                                                    MaterialCardView materialCardView8 = c8302i5.f44899e;
                                                                                    C5207g.m11110e(materialCardView8, "card5");
                                                                                    MaterialTextView materialTextView8 = c8302i5.f44905k;
                                                                                    C5207g.m11110e(materialTextView8, "tvCard5");
                                                                                    matchPairView.m10310a(materialCardView8, materialTextView8);
                                                                                    break;
                                                                            }
                                                                        }
                                                                    });
                                                                    materialCardView2.setOnClickListener(new View.OnClickListener(this) { // from class: yj.d

                                                                        /* JADX INFO: renamed from: b */
                                                                        public final /* synthetic */ MatchPairView f52203b;

                                                                        {
                                                                            this.f52203b = this;
                                                                        }

                                                                        @Override // android.view.View.OnClickListener
                                                                        public final void onClick(View view) {
                                                                            int i12 = i10;
                                                                            C8302i4 c8302i5 = c8302i4;
                                                                            MatchPairView matchPairView = this.f52203b;
                                                                            switch (i12) {
                                                                                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                                                                    int i13 = MatchPairView.f30458l;
                                                                                    C5207g.m11111f(matchPairView, "this$0");
                                                                                    C5207g.m11111f(c8302i5, "$this_with");
                                                                                    MaterialCardView materialCardView7 = c8302i5.f44896b;
                                                                                    C5207g.m11110e(materialCardView7, "card2");
                                                                                    MaterialTextView materialTextView7 = c8302i5.f44902h;
                                                                                    C5207g.m11110e(materialTextView7, "tvCard2");
                                                                                    matchPairView.m10310a(materialCardView7, materialTextView7);
                                                                                    break;
                                                                                default:
                                                                                    int i14 = MatchPairView.f30458l;
                                                                                    C5207g.m11111f(matchPairView, "this$0");
                                                                                    C5207g.m11111f(c8302i5, "$this_with");
                                                                                    MaterialCardView materialCardView8 = c8302i5.f44900f;
                                                                                    C5207g.m11110e(materialCardView8, "card6");
                                                                                    MaterialTextView materialTextView8 = c8302i5.f44906l;
                                                                                    C5207g.m11110e(materialTextView8, "tvCard6");
                                                                                    matchPairView.m10310a(materialCardView8, materialTextView8);
                                                                                    break;
                                                                            }
                                                                        }
                                                                    });
                                                                    materialCardView3.setOnClickListener(new ViewOnClickListenerC9466e(this, 16, c8302i4));
                                                                    materialCardView4.setOnClickListener(new ViewOnClickListenerC9029m(this, 18, c8302i4));
                                                                    final int i12 = 1;
                                                                    materialCardView5.setOnClickListener(new View.OnClickListener(this) { // from class: yj.c

                                                                        /* JADX INFO: renamed from: b */
                                                                        public final /* synthetic */ MatchPairView f52200b;

                                                                        {
                                                                            this.f52200b = this;
                                                                        }

                                                                        @Override // android.view.View.OnClickListener
                                                                        public final void onClick(View view) {
                                                                            int i13 = i12;
                                                                            C8302i4 c8302i5 = c8302i4;
                                                                            MatchPairView matchPairView = this.f52200b;
                                                                            switch (i13) {
                                                                                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                                                                    int i14 = MatchPairView.f30458l;
                                                                                    C5207g.m11111f(matchPairView, "this$0");
                                                                                    C5207g.m11111f(c8302i5, "$this_with");
                                                                                    MaterialCardView materialCardView7 = c8302i5.f44895a;
                                                                                    C5207g.m11110e(materialCardView7, "card1");
                                                                                    MaterialTextView materialTextView7 = c8302i5.f44901g;
                                                                                    C5207g.m11110e(materialTextView7, "tvCard1");
                                                                                    matchPairView.m10310a(materialCardView7, materialTextView7);
                                                                                    break;
                                                                                default:
                                                                                    int i15 = MatchPairView.f30458l;
                                                                                    C5207g.m11111f(matchPairView, "this$0");
                                                                                    C5207g.m11111f(c8302i5, "$this_with");
                                                                                    MaterialCardView materialCardView8 = c8302i5.f44899e;
                                                                                    C5207g.m11110e(materialCardView8, "card5");
                                                                                    MaterialTextView materialTextView8 = c8302i5.f44905k;
                                                                                    C5207g.m11110e(materialTextView8, "tvCard5");
                                                                                    matchPairView.m10310a(materialCardView8, materialTextView8);
                                                                                    break;
                                                                            }
                                                                        }
                                                                    });
                                                                    materialCardView6.setOnClickListener(new View.OnClickListener(this) { // from class: yj.d

                                                                        /* JADX INFO: renamed from: b */
                                                                        public final /* synthetic */ MatchPairView f52203b;

                                                                        {
                                                                            this.f52203b = this;
                                                                        }

                                                                        @Override // android.view.View.OnClickListener
                                                                        public final void onClick(View view) {
                                                                            int i13 = i12;
                                                                            C8302i4 c8302i5 = c8302i4;
                                                                            MatchPairView matchPairView = this.f52203b;
                                                                            switch (i13) {
                                                                                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                                                                    int i14 = MatchPairView.f30458l;
                                                                                    C5207g.m11111f(matchPairView, "this$0");
                                                                                    C5207g.m11111f(c8302i5, "$this_with");
                                                                                    MaterialCardView materialCardView7 = c8302i5.f44896b;
                                                                                    C5207g.m11110e(materialCardView7, "card2");
                                                                                    MaterialTextView materialTextView7 = c8302i5.f44902h;
                                                                                    C5207g.m11110e(materialTextView7, "tvCard2");
                                                                                    matchPairView.m10310a(materialCardView7, materialTextView7);
                                                                                    break;
                                                                                default:
                                                                                    int i15 = MatchPairView.f30458l;
                                                                                    C5207g.m11111f(matchPairView, "this$0");
                                                                                    C5207g.m11111f(c8302i5, "$this_with");
                                                                                    MaterialCardView materialCardView8 = c8302i5.f44900f;
                                                                                    C5207g.m11110e(materialCardView8, "card6");
                                                                                    MaterialTextView materialTextView8 = c8302i5.f44906l;
                                                                                    C5207g.m11110e(materialTextView8, "tvCard6");
                                                                                    matchPairView.m10310a(materialCardView8, materialTextView8);
                                                                                    break;
                                                                            }
                                                                        }
                                                                    });
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }

    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.material.card.MaterialCardView, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX INFO: renamed from: a */
    public final void m10310a(MaterialCardView materialCardView, MaterialTextView materialTextView) {
        Object next;
        ?? r10;
        C10399a c10399a;
        InterfaceC10400b interfaceC10400b;
        HashSet<String> hashSet = this.f30461c;
        String string = materialTextView.getText().toString();
        Locale locale = Locale.getDefault();
        C5207g.m11110e(locale, "getDefault()");
        String lowerCase = string.toLowerCase(locale);
        C5207g.m11110e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (hashSet.contains(lowerCase) && (interfaceC10400b = this.f30468j) != null) {
            interfaceC10400b.mo10271a(materialTextView.getText().toString());
        }
        if (this.f30462d == null) {
            materialCardView.setStrokeColor(this.f30465g);
            this.f30462d = materialTextView.getText().toString();
            this.f30463e = materialCardView;
            return;
        }
        MaterialCardView materialCardView2 = this.f30463e;
        int i10 = this.f30464f;
        if (materialCardView2 == materialCardView) {
            materialCardView.setStrokeColor(i10);
            this.f30462d = null;
            this.f30463e = null;
            return;
        }
        Iterator<T> it = this.f30460b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                c10399a = (C10399a) next;
            }
        } while (!(C7661i.m15249O2(c10399a.f52197a, this.f30462d) || C7661i.m15249O2(c10399a.f52198b, this.f30462d)));
        C10399a c10399a2 = (C10399a) next;
        if (c10399a2 != null) {
            String str = this.f30462d;
            String str2 = c10399a2.f52197a;
            boolean zM11106a = C5207g.m11106a(str, str2);
            String str3 = c10399a2.f52198b;
            if (zM11106a) {
                str2 = str3;
            } else if (!C5207g.m11106a(str, str3)) {
                str2 = "";
            }
            MaterialCardView materialCardView3 = this.f30463e;
            if (materialCardView3 != null) {
                if (C7661i.m15249O2(str2, materialTextView.getText().toString())) {
                    InterfaceC10400b interfaceC10400b2 = this.f30468j;
                    if (interfaceC10400b2 != null) {
                        int i11 = this.f30469k + 1;
                        this.f30469k = i11;
                        interfaceC10400b2.mo10272b(i11);
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    int i12 = this.f30467i;
                    animatorSet.playTogether(C10404f.m19393b(materialCardView3, i12), C10404f.m19392a(materialCardView3, i12), C10404f.m19393b(materialCardView, i12), C10404f.m19392a(materialCardView, i12));
                    animatorSet.setStartDelay(200L);
                    animatorSet.addListener(new C10403e(materialCardView3, materialCardView));
                    animatorSet.start();
                } else {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    int i13 = this.f30466h;
                    animatorSet2.playTogether(C10404f.m19393b(materialCardView3, i13), C10404f.m19392a(materialCardView3, i13), C10404f.m19393b(materialCardView, i13), C10404f.m19392a(materialCardView, i13));
                    animatorSet2.setStartDelay(200L);
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    List<Integer> list = C6716m.f37937a;
                    Context context = getContext();
                    C5207g.m11110e(context, "context");
                    Context context2 = getContext();
                    C5207g.m11110e(context2, "context");
                    animatorSet3.playTogether(C10404f.m19393b(materialCardView3, i10), C10404f.m19392a(materialCardView3, C6716m.m13333r(R.attr.backgroundCardColor, context)), C10404f.m19393b(materialCardView, i10), C10404f.m19392a(materialCardView, C6716m.m13333r(R.attr.backgroundCardColor, context2)));
                    animatorSet3.setStartDelay(200L);
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    animatorSet4.playSequentially(animatorSet2, animatorSet3);
                    animatorSet4.start();
                }
                r10 = 0;
            } else {
                r10 = 0;
            }
            this.f30463e = r10;
            this.f30462d = r10;
        }
    }

    public final void setListener(InterfaceC10400b interfaceC10400b) {
        C5207g.m11111f(interfaceC10400b, "listener");
        this.f30468j = interfaceC10400b;
    }

    public final void setup(List<C10399a> list) {
        C5207g.m11111f(list, "data");
        this.f30469k = 0;
        HashSet<String> hashSet = this.f30461c;
        hashSet.clear();
        this.f30460b = list;
        ArrayList arrayList = new ArrayList();
        for (C10399a c10399a : list) {
            arrayList.add(c10399a.f52197a);
            Locale locale = Locale.getDefault();
            C5207g.m11110e(locale, "getDefault()");
            String lowerCase = c10399a.f52197a.toLowerCase(locale);
            C5207g.m11110e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            hashSet.add(lowerCase);
            arrayList.add(c10399a.f52198b);
        }
        Collections.shuffle(arrayList);
        C8302i4 c8302i4 = this.f30459a;
        c8302i4.f44901g.setText((CharSequence) arrayList.get(0));
        c8302i4.f44902h.setText((CharSequence) arrayList.get(1));
        c8302i4.f44903i.setText((CharSequence) arrayList.get(2));
        c8302i4.f44904j.setText((CharSequence) arrayList.get(3));
        c8302i4.f44905k.setText((CharSequence) arrayList.get(4));
        c8302i4.f44906l.setText((CharSequence) arrayList.get(5));
    }
}
