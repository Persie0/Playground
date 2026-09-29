package com.lingq.feature.review.views.speaking;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.R$attr;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import com.lingq.feature.review.R$id;
import com.lingq.feature.review.R$layout;
import com.lingq.feature.review.views.speaking.MatchPairView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.EmptyList;
import p000.C3386nv;
import p000.fa4;
import p000.jfa;
import p000.kob;
import p000.lfa;
import p000.n21;
import p000.vq5;
import p000.vta;
import p000.wq5;
import p000.y52;

/* JADX INFO: loaded from: classes3.dex */
public final class MatchPairView extends FrameLayout {

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ int f32788l = 0;

    /* JADX INFO: renamed from: a */
    public final vta f32789a;

    /* JADX INFO: renamed from: b */
    public List f32790b;

    /* JADX INFO: renamed from: c */
    public final HashSet f32791c;

    /* JADX INFO: renamed from: d */
    public String f32792d;

    /* JADX INFO: renamed from: e */
    public MaterialCardView f32793e;

    /* JADX INFO: renamed from: f */
    public final int f32794f;

    /* JADX INFO: renamed from: g */
    public final int f32795g;

    /* JADX INFO: renamed from: h */
    public final int f32796h;

    /* JADX INFO: renamed from: i */
    public final int f32797i;

    /* JADX INFO: renamed from: j */
    public wq5 f32798j;

    /* JADX INFO: renamed from: k */
    public int f32799k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatchPairView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.f32790b = EmptyList.f47638a;
        this.f32791c = new HashSet();
        this.f32794f = jfa.m14431n(context, R$attr.colorOnSurface);
        this.f32795g = jfa.m14431n(context, com.lingq.core.designsystem.R$attr.blueTint);
        this.f32796h = jfa.m14431n(context, com.lingq.core.designsystem.R$attr.redTint);
        this.f32797i = jfa.m14431n(context, com.lingq.core.designsystem.R$attr.greenTint);
        final int i = 0;
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.view_match_pair, (ViewGroup) this, false);
        addView(viewInflate);
        int i2 = R$id.card1;
        MaterialCardView materialCardView = (MaterialCardView) lfa.m16159c(viewInflate, i2);
        if (materialCardView != null) {
            i2 = R$id.card2;
            MaterialCardView materialCardView2 = (MaterialCardView) lfa.m16159c(viewInflate, i2);
            if (materialCardView2 != null) {
                i2 = R$id.card3;
                MaterialCardView materialCardView3 = (MaterialCardView) lfa.m16159c(viewInflate, i2);
                if (materialCardView3 != null) {
                    i2 = R$id.card4;
                    MaterialCardView materialCardView4 = (MaterialCardView) lfa.m16159c(viewInflate, i2);
                    if (materialCardView4 != null) {
                        i2 = R$id.card5;
                        MaterialCardView materialCardView5 = (MaterialCardView) lfa.m16159c(viewInflate, i2);
                        if (materialCardView5 != null) {
                            i2 = R$id.card6;
                            MaterialCardView materialCardView6 = (MaterialCardView) lfa.m16159c(viewInflate, i2);
                            if (materialCardView6 != null) {
                                i2 = R$id.tvCard1;
                                MaterialTextView materialTextView = (MaterialTextView) lfa.m16159c(viewInflate, i2);
                                if (materialTextView != null) {
                                    i2 = R$id.tvCard2;
                                    MaterialTextView materialTextView2 = (MaterialTextView) lfa.m16159c(viewInflate, i2);
                                    if (materialTextView2 != null) {
                                        i2 = R$id.tvCard3;
                                        MaterialTextView materialTextView3 = (MaterialTextView) lfa.m16159c(viewInflate, i2);
                                        if (materialTextView3 != null) {
                                            i2 = R$id.tvCard4;
                                            MaterialTextView materialTextView4 = (MaterialTextView) lfa.m16159c(viewInflate, i2);
                                            if (materialTextView4 != null) {
                                                i2 = R$id.tvCard5;
                                                MaterialTextView materialTextView5 = (MaterialTextView) lfa.m16159c(viewInflate, i2);
                                                if (materialTextView5 != null) {
                                                    i2 = R$id.tvCard6;
                                                    MaterialTextView materialTextView6 = (MaterialTextView) lfa.m16159c(viewInflate, i2);
                                                    if (materialTextView6 != null) {
                                                        i2 = R$id.viewBottom;
                                                        if (((LinearLayout) lfa.m16159c(viewInflate, i2)) != null) {
                                                            i2 = R$id.viewMiddle;
                                                            if (((LinearLayout) lfa.m16159c(viewInflate, i2)) != null) {
                                                                i2 = R$id.viewTop;
                                                                if (((LinearLayout) lfa.m16159c(viewInflate, i2)) != null) {
                                                                    final vta vtaVar = new vta(materialCardView, materialCardView2, materialCardView3, materialCardView4, materialCardView5, materialCardView6, materialTextView, materialTextView2, materialTextView3, materialTextView4, materialTextView5, materialTextView6);
                                                                    this.f32789a = vtaVar;
                                                                    materialCardView.setOnClickListener(new View.OnClickListener(this) { // from class: xq5

                                                                        /* JADX INFO: renamed from: b */
                                                                        public final /* synthetic */ MatchPairView f68540b;

                                                                        {
                                                                            this.f68540b = this;
                                                                        }

                                                                        @Override // android.view.View.OnClickListener
                                                                        public final void onClick(View view) {
                                                                            int i3 = i;
                                                                            vta vtaVar2 = vtaVar;
                                                                            MatchPairView matchPairView = this.f68540b;
                                                                            switch (i3) {
                                                                                case 0:
                                                                                    int i4 = MatchPairView.f32788l;
                                                                                    matchPairView.m9661a(vtaVar2.f65895a, vtaVar2.f65901g);
                                                                                    break;
                                                                                case 1:
                                                                                    int i5 = MatchPairView.f32788l;
                                                                                    matchPairView.m9661a(vtaVar2.f65896b, vtaVar2.f65902h);
                                                                                    break;
                                                                                case 2:
                                                                                    int i6 = MatchPairView.f32788l;
                                                                                    matchPairView.m9661a(vtaVar2.f65897c, vtaVar2.f65903i);
                                                                                    break;
                                                                                case 3:
                                                                                    int i7 = MatchPairView.f32788l;
                                                                                    matchPairView.m9661a(vtaVar2.f65898d, vtaVar2.f65904j);
                                                                                    break;
                                                                                case 4:
                                                                                    int i8 = MatchPairView.f32788l;
                                                                                    matchPairView.m9661a(vtaVar2.f65899e, vtaVar2.f65905k);
                                                                                    break;
                                                                                default:
                                                                                    int i9 = MatchPairView.f32788l;
                                                                                    matchPairView.m9661a(vtaVar2.f65900f, vtaVar2.f65906l);
                                                                                    break;
                                                                            }
                                                                        }
                                                                    });
                                                                    final int i3 = 1;
                                                                    materialCardView2.setOnClickListener(new View.OnClickListener(this) { // from class: xq5

                                                                        /* JADX INFO: renamed from: b */
                                                                        public final /* synthetic */ MatchPairView f68540b;

                                                                        {
                                                                            this.f68540b = this;
                                                                        }

                                                                        @Override // android.view.View.OnClickListener
                                                                        public final void onClick(View view) {
                                                                            int i4 = i3;
                                                                            vta vtaVar2 = vtaVar;
                                                                            MatchPairView matchPairView = this.f68540b;
                                                                            switch (i4) {
                                                                                case 0:
                                                                                    int i5 = MatchPairView.f32788l;
                                                                                    matchPairView.m9661a(vtaVar2.f65895a, vtaVar2.f65901g);
                                                                                    break;
                                                                                case 1:
                                                                                    int i6 = MatchPairView.f32788l;
                                                                                    matchPairView.m9661a(vtaVar2.f65896b, vtaVar2.f65902h);
                                                                                    break;
                                                                                case 2:
                                                                                    int i7 = MatchPairView.f32788l;
                                                                                    matchPairView.m9661a(vtaVar2.f65897c, vtaVar2.f65903i);
                                                                                    break;
                                                                                case 3:
                                                                                    int i8 = MatchPairView.f32788l;
                                                                                    matchPairView.m9661a(vtaVar2.f65898d, vtaVar2.f65904j);
                                                                                    break;
                                                                                case 4:
                                                                                    int i9 = MatchPairView.f32788l;
                                                                                    matchPairView.m9661a(vtaVar2.f65899e, vtaVar2.f65905k);
                                                                                    break;
                                                                                default:
                                                                                    int i10 = MatchPairView.f32788l;
                                                                                    matchPairView.m9661a(vtaVar2.f65900f, vtaVar2.f65906l);
                                                                                    break;
                                                                            }
                                                                        }
                                                                    });
                                                                    final int i4 = 2;
                                                                    materialCardView3.setOnClickListener(new View.OnClickListener(this) { // from class: xq5

                                                                        /* JADX INFO: renamed from: b */
                                                                        public final /* synthetic */ MatchPairView f68540b;

                                                                        {
                                                                            this.f68540b = this;
                                                                        }

                                                                        @Override // android.view.View.OnClickListener
                                                                        public final void onClick(View view) {
                                                                            int i5 = i4;
                                                                            vta vtaVar2 = vtaVar;
                                                                            MatchPairView matchPairView = this.f68540b;
                                                                            switch (i5) {
                                                                                case 0:
                                                                                    int i6 = MatchPairView.f32788l;
                                                                                    matchPairView.m9661a(vtaVar2.f65895a, vtaVar2.f65901g);
                                                                                    break;
                                                                                case 1:
                                                                                    int i7 = MatchPairView.f32788l;
                                                                                    matchPairView.m9661a(vtaVar2.f65896b, vtaVar2.f65902h);
                                                                                    break;
                                                                                case 2:
                                                                                    int i8 = MatchPairView.f32788l;
                                                                                    matchPairView.m9661a(vtaVar2.f65897c, vtaVar2.f65903i);
                                                                                    break;
                                                                                case 3:
                                                                                    int i9 = MatchPairView.f32788l;
                                                                                    matchPairView.m9661a(vtaVar2.f65898d, vtaVar2.f65904j);
                                                                                    break;
                                                                                case 4:
                                                                                    int i10 = MatchPairView.f32788l;
                                                                                    matchPairView.m9661a(vtaVar2.f65899e, vtaVar2.f65905k);
                                                                                    break;
                                                                                default:
                                                                                    int i11 = MatchPairView.f32788l;
                                                                                    matchPairView.m9661a(vtaVar2.f65900f, vtaVar2.f65906l);
                                                                                    break;
                                                                            }
                                                                        }
                                                                    });
                                                                    final int i5 = 3;
                                                                    materialCardView4.setOnClickListener(new View.OnClickListener(this) { // from class: xq5

                                                                        /* JADX INFO: renamed from: b */
                                                                        public final /* synthetic */ MatchPairView f68540b;

                                                                        {
                                                                            this.f68540b = this;
                                                                        }

                                                                        @Override // android.view.View.OnClickListener
                                                                        public final void onClick(View view) {
                                                                            int i6 = i5;
                                                                            vta vtaVar2 = vtaVar;
                                                                            MatchPairView matchPairView = this.f68540b;
                                                                            switch (i6) {
                                                                                case 0:
                                                                                    int i7 = MatchPairView.f32788l;
                                                                                    matchPairView.m9661a(vtaVar2.f65895a, vtaVar2.f65901g);
                                                                                    break;
                                                                                case 1:
                                                                                    int i8 = MatchPairView.f32788l;
                                                                                    matchPairView.m9661a(vtaVar2.f65896b, vtaVar2.f65902h);
                                                                                    break;
                                                                                case 2:
                                                                                    int i9 = MatchPairView.f32788l;
                                                                                    matchPairView.m9661a(vtaVar2.f65897c, vtaVar2.f65903i);
                                                                                    break;
                                                                                case 3:
                                                                                    int i10 = MatchPairView.f32788l;
                                                                                    matchPairView.m9661a(vtaVar2.f65898d, vtaVar2.f65904j);
                                                                                    break;
                                                                                case 4:
                                                                                    int i11 = MatchPairView.f32788l;
                                                                                    matchPairView.m9661a(vtaVar2.f65899e, vtaVar2.f65905k);
                                                                                    break;
                                                                                default:
                                                                                    int i12 = MatchPairView.f32788l;
                                                                                    matchPairView.m9661a(vtaVar2.f65900f, vtaVar2.f65906l);
                                                                                    break;
                                                                            }
                                                                        }
                                                                    });
                                                                    final int i6 = 4;
                                                                    materialCardView5.setOnClickListener(new View.OnClickListener(this) { // from class: xq5

                                                                        /* JADX INFO: renamed from: b */
                                                                        public final /* synthetic */ MatchPairView f68540b;

                                                                        {
                                                                            this.f68540b = this;
                                                                        }

                                                                        @Override // android.view.View.OnClickListener
                                                                        public final void onClick(View view) {
                                                                            int i7 = i6;
                                                                            vta vtaVar2 = vtaVar;
                                                                            MatchPairView matchPairView = this.f68540b;
                                                                            switch (i7) {
                                                                                case 0:
                                                                                    int i8 = MatchPairView.f32788l;
                                                                                    matchPairView.m9661a(vtaVar2.f65895a, vtaVar2.f65901g);
                                                                                    break;
                                                                                case 1:
                                                                                    int i9 = MatchPairView.f32788l;
                                                                                    matchPairView.m9661a(vtaVar2.f65896b, vtaVar2.f65902h);
                                                                                    break;
                                                                                case 2:
                                                                                    int i10 = MatchPairView.f32788l;
                                                                                    matchPairView.m9661a(vtaVar2.f65897c, vtaVar2.f65903i);
                                                                                    break;
                                                                                case 3:
                                                                                    int i11 = MatchPairView.f32788l;
                                                                                    matchPairView.m9661a(vtaVar2.f65898d, vtaVar2.f65904j);
                                                                                    break;
                                                                                case 4:
                                                                                    int i12 = MatchPairView.f32788l;
                                                                                    matchPairView.m9661a(vtaVar2.f65899e, vtaVar2.f65905k);
                                                                                    break;
                                                                                default:
                                                                                    int i13 = MatchPairView.f32788l;
                                                                                    matchPairView.m9661a(vtaVar2.f65900f, vtaVar2.f65906l);
                                                                                    break;
                                                                            }
                                                                        }
                                                                    });
                                                                    final int i7 = 5;
                                                                    materialCardView6.setOnClickListener(new View.OnClickListener(this) { // from class: xq5

                                                                        /* JADX INFO: renamed from: b */
                                                                        public final /* synthetic */ MatchPairView f68540b;

                                                                        {
                                                                            this.f68540b = this;
                                                                        }

                                                                        @Override // android.view.View.OnClickListener
                                                                        public final void onClick(View view) {
                                                                            int i8 = i7;
                                                                            vta vtaVar2 = vtaVar;
                                                                            MatchPairView matchPairView = this.f68540b;
                                                                            switch (i8) {
                                                                                case 0:
                                                                                    int i9 = MatchPairView.f32788l;
                                                                                    matchPairView.m9661a(vtaVar2.f65895a, vtaVar2.f65901g);
                                                                                    break;
                                                                                case 1:
                                                                                    int i10 = MatchPairView.f32788l;
                                                                                    matchPairView.m9661a(vtaVar2.f65896b, vtaVar2.f65902h);
                                                                                    break;
                                                                                case 2:
                                                                                    int i11 = MatchPairView.f32788l;
                                                                                    matchPairView.m9661a(vtaVar2.f65897c, vtaVar2.f65903i);
                                                                                    break;
                                                                                case 3:
                                                                                    int i12 = MatchPairView.f32788l;
                                                                                    matchPairView.m9661a(vtaVar2.f65898d, vtaVar2.f65904j);
                                                                                    break;
                                                                                case 4:
                                                                                    int i13 = MatchPairView.f32788l;
                                                                                    matchPairView.m9661a(vtaVar2.f65899e, vtaVar2.f65905k);
                                                                                    break;
                                                                                default:
                                                                                    int i14 = MatchPairView.f32788l;
                                                                                    matchPairView.m9661a(vtaVar2.f65900f, vtaVar2.f65906l);
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
        C3386nv.m17635v("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final void m9661a(MaterialCardView materialCardView, TextView textView) {
        Object next;
        vq5 vq5Var;
        wq5 wq5Var;
        String string = textView.getText().toString();
        Locale locale = Locale.getDefault();
        locale.getClass();
        String lowerCase = string.toLowerCase(locale);
        lowerCase.getClass();
        if (this.f32791c.contains(lowerCase) && (wq5Var = this.f32798j) != null) {
            wq5Var.mo9555b(textView.getText().toString());
        }
        if (this.f32792d == null) {
            materialCardView.setStrokeColor(this.f32795g);
            this.f32792d = textView.getText().toString();
            this.f32793e = materialCardView;
            return;
        }
        MaterialCardView materialCardView2 = this.f32793e;
        int i = this.f32794f;
        if (materialCardView2 == materialCardView) {
            materialCardView.setStrokeColor(i);
            this.f32792d = null;
            this.f32793e = null;
            return;
        }
        Iterator it = this.f32790b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            vq5Var = (vq5) next;
            if (vq5Var.f65786a.equalsIgnoreCase(this.f32792d)) {
                break;
            }
        } while (!vq5Var.f65787b.equalsIgnoreCase(this.f32792d));
        vq5 vq5Var2 = (vq5) next;
        if (vq5Var2 != null) {
            String str = vq5Var2.f65786a;
            String str2 = this.f32792d;
            boolean zM11650l = fa4.m11650l(str2, str);
            String str3 = vq5Var2.f65787b;
            if (zM11650l) {
                str = str3;
            } else if (!fa4.m11650l(str2, str3)) {
                str = "";
            }
            MaterialCardView materialCardView3 = this.f32793e;
            if (materialCardView3 != null) {
                if (str.equalsIgnoreCase(textView.getText().toString())) {
                    wq5 wq5Var2 = this.f32798j;
                    if (wq5Var2 != null) {
                        int i2 = this.f32799k + 1;
                        this.f32799k = i2;
                        wq5Var2.mo9557k(i2);
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    int i3 = this.f32797i;
                    animatorSet.playTogether(kob.m15345b(materialCardView3, i3), kob.m15344a(materialCardView3, i3), kob.m15345b(materialCardView, i3), kob.m15344a(materialCardView, i3));
                    animatorSet.setStartDelay(200L);
                    animatorSet.addListener(new n21(materialCardView3, materialCardView));
                    animatorSet.start();
                } else {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    int i4 = this.f32796h;
                    animatorSet2.playTogether(kob.m15345b(materialCardView3, i4), kob.m15344a(materialCardView3, i4), kob.m15345b(materialCardView, i4), kob.m15344a(materialCardView, i4));
                    animatorSet2.setStartDelay(200L);
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    ObjectAnimator objectAnimatorM15345b = kob.m15345b(materialCardView3, i);
                    Context context = getContext();
                    context.getClass();
                    ObjectAnimator objectAnimatorM15344a = kob.m15344a(materialCardView3, jfa.m14431n(context, R$attr.colorSurfaceContainer));
                    ObjectAnimator objectAnimatorM15345b2 = kob.m15345b(materialCardView, i);
                    Context context2 = getContext();
                    context2.getClass();
                    animatorSet3.playTogether(objectAnimatorM15345b, objectAnimatorM15344a, objectAnimatorM15345b2, kob.m15344a(materialCardView, jfa.m14431n(context2, R$attr.colorSurfaceContainer)));
                    animatorSet3.setStartDelay(200L);
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    animatorSet4.playSequentially(animatorSet2, animatorSet3);
                    animatorSet4.start();
                }
            }
            this.f32793e = null;
            this.f32792d = null;
        }
    }

    public final void setListener(wq5 wq5Var) {
        wq5Var.getClass();
        this.f32798j = wq5Var;
    }

    public final void setup(List<vq5> list) {
        list.getClass();
        this.f32799k = 0;
        HashSet hashSet = this.f32791c;
        hashSet.clear();
        this.f32790b = list;
        ArrayList arrayList = new ArrayList();
        for (vq5 vq5Var : list) {
            arrayList.add(vq5Var.f65786a);
            String str = vq5Var.f65786a;
            Locale locale = Locale.getDefault();
            locale.getClass();
            String lowerCase = str.toLowerCase(locale);
            lowerCase.getClass();
            hashSet.add(lowerCase);
            arrayList.add(vq5Var.f65787b);
        }
        Collections.shuffle(arrayList);
        vta vtaVar = this.f32789a;
        vtaVar.f65901g.setText((CharSequence) arrayList.get(0));
        vtaVar.f65902h.setText((CharSequence) arrayList.get(1));
        vtaVar.f65903i.setText((CharSequence) arrayList.get(2));
        vtaVar.f65904j.setText((CharSequence) arrayList.get(3));
        vtaVar.f65905k.setText((CharSequence) arrayList.get(4));
        vtaVar.f65906l.setText((CharSequence) arrayList.get(5));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MatchPairView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    public /* synthetic */ MatchPairView(Context context, AttributeSet attributeSet, int i, y52 y52Var) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
