package p000;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.net.TrafficStats;
import android.util.Pair;
import android.util.Size;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.bottombar.BottomBar;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.BottomBarLayoutListener;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.bottombar.RoundedThumbnailView;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import p021j$.util.Collection$EL;
import p021j$.util.function.Consumer$CC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hhr implements hhi {

    /* JADX INFO: renamed from: A */
    private AnimatorSet f27825A;

    /* JADX INFO: renamed from: B */
    private FrameLayout f27826B;

    /* JADX INFO: renamed from: C */
    private FrameLayout f27827C;

    /* JADX INFO: renamed from: D */
    private hhc f27828D;

    /* JADX INFO: renamed from: a */
    public final boolean f27829a;

    /* JADX INFO: renamed from: b */
    public final boolean f27830b;

    /* JADX INFO: renamed from: c */
    public final Context f27831c;

    /* JADX INFO: renamed from: d */
    public final hah f27832d;

    /* JADX INFO: renamed from: e */
    public final msi f27833e;

    /* JADX INFO: renamed from: f */
    public final jwn f27834f;

    /* JADX INFO: renamed from: h */
    public ConstraintLayout f27836h;

    /* JADX INFO: renamed from: i */
    public ConstraintLayout f27837i;

    /* JADX INFO: renamed from: j */
    public GestureDetector f27838j;

    /* JADX INFO: renamed from: k */
    public idn f27839k;

    /* JADX INFO: renamed from: m */
    public Runnable f27841m;

    /* JADX INFO: renamed from: n */
    public View f27842n;

    /* JADX INFO: renamed from: o */
    public View f27843o;

    /* JADX INFO: renamed from: p */
    public hhh f27844p;

    /* JADX INFO: renamed from: q */
    public Animator f27845q;

    /* JADX INFO: renamed from: s */
    public AmbientModeSupport.AmbientController f27847s;

    /* JADX INFO: renamed from: t */
    private final BottomBar f27848t;

    /* JADX INFO: renamed from: u */
    private final BottomBarController f27849u;

    /* JADX INFO: renamed from: v */
    private final Executor f27850v;

    /* JADX INFO: renamed from: w */
    private final dhv f27851w;

    /* JADX INFO: renamed from: x */
    private final RoundedThumbnailView f27852x;

    /* JADX INFO: renamed from: y */
    private final hai f27853y;

    /* JADX INFO: renamed from: z */
    private final ViewGroup f27854z;

    /* JADX INFO: renamed from: l */
    public ilk f27840l = ilk.PORTRAIT;

    /* JADX INFO: renamed from: r */
    public int f27846r = 1;

    /* JADX INFO: renamed from: g */
    public final ArrayList f27835g = new ArrayList();

    public hhr(boolean z, boolean z2, Context context, Executor executor, BottomBar bottomBar, BottomBarController bottomBarController, dhv dhvVar, RoundedThumbnailView roundedThumbnailView, hah hahVar, hai haiVar, msi msiVar, jwn jwnVar) {
        this.f27829a = z;
        this.f27830b = z2;
        this.f27831c = context;
        this.f27848t = bottomBar;
        this.f27849u = bottomBarController;
        this.f27850v = executor;
        this.f27851w = dhvVar;
        this.f27852x = roundedThumbnailView;
        this.f27854z = (ViewGroup) roundedThumbnailView.getParent().getParent();
        this.f27832d = hahVar;
        this.f27853y = haiVar;
        this.f27833e = msiVar;
        this.f27834f = jwnVar;
    }

    /* JADX INFO: renamed from: m */
    public static final void m10307m(ConstraintLayout constraintLayout, View view, Rect rect) {
        C1190zy c1190zy = new C1190zy();
        c1190zy.m19820e(constraintLayout);
        c1190zy.m19823h(view.getId(), 6, 0, 6, rect.left);
        c1190zy.m19823h(view.getId(), 3, 0, 3, rect.top);
        c1190zy.m19818c(constraintLayout);
    }

    /* JADX INFO: renamed from: n */
    private final void m10308n(ViewGroup viewGroup) {
        if (this.f27844p.getParent() == viewGroup) {
            return;
        }
        ((ViewGroup) this.f27844p.getParent()).removeView(this.f27844p);
        viewGroup.addView(this.f27844p);
    }

    /* JADX INFO: renamed from: o */
    private final void m10309o(mws mwsVar) {
        AnimatorSet animatorSet = this.f27825A;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f27825A.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f27825A = animatorSet2;
        animatorSet2.playTogether(mwsVar);
        this.f27825A.start();
    }

    /* JADX INFO: renamed from: p */
    private static final boolean m10310p(hzj hzjVar, ilk ilkVar) {
        return (hzjVar.equals(hzj.TABLET_LAYOUT) || hzjVar.equals(hzj.STARFISH_LAYOUT)) && ilkVar.equals(ilk.LANDSCAPE);
    }

    @Override // p000.hhi
    /* JADX INFO: renamed from: a */
    public final nps mo10298a(final ArrayList arrayList) {
        final nqf nqfVarM17621g = nqf.m17621g();
        int i = this.f27846r;
        if (i == 0) {
            throw null;
        }
        if (i != 1) {
            nqfVarM17621g.mo14894e(true);
            return nqfVarM17621g;
        }
        final nqf nqfVarM17621g2 = nqf.m17621g();
        dez.m6037g(new Runnable() { // from class: hhl
            @Override // java.lang.Runnable
            public final void run() {
                Drawable drawableLoadIcon;
                hhr hhrVar = this.f27816a;
                ArrayList arrayList2 = arrayList;
                nqf nqfVar = nqfVarM17621g2;
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    hhs hhsVar = (hhs) arrayList2.get(i2);
                    if (hhrVar.m10313l()) {
                        break;
                    }
                    if (hhrVar.f27829a) {
                        drawableLoadIcon = hhrVar.f27831c.getDrawable(C0100R.drawable.social_app_security_icon);
                        drawableLoadIcon.getClass();
                    } else {
                        drawableLoadIcon = hhsVar.f27855a.loadIcon(hhrVar.f27831c.getPackageManager());
                    }
                    arrayList3.add(new Pair(hhsVar, drawableLoadIcon));
                }
                nqfVar.mo14894e(arrayList3);
            }
        }, this.f27850v, "ssui").mo3538bd();
        jvh.m13562j(nqfVarM17621g2, new kao() { // from class: hhm
            @Override // p000.kao
            /* JADX INFO: renamed from: a */
            public final void mo3483a(Object obj) {
                hhh hhhVar;
                View view;
                hhr hhrVar = this.f27819a;
                nqf nqfVar = nqfVarM17621g;
                ArrayList arrayList2 = (ArrayList) obj;
                if (hhrVar.m10313l()) {
                    nqfVar.mo14894e(false);
                    return;
                }
                int i2 = hhrVar.f27846r;
                if (i2 == 0) {
                    throw null;
                }
                if (i2 != 1) {
                    nqfVar.mo14894e(true);
                    return;
                }
                if (arrayList2 != null) {
                    hhh hhhVar2 = hhrVar.f27844p;
                    ArrayList arrayList3 = hhhVar2.f27807b;
                    int size = arrayList3.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        hhe hheVar = (hhe) arrayList3.get(i3);
                        jfs jfsVar = hhhVar2.f27812g;
                        jvd.m13538a();
                        ((ArrayList) jfsVar.f33914a).remove(hheVar);
                        hhhVar2.removeView(hheVar);
                    }
                    hhhVar2.f27807b.clear();
                    hhh hhhVar3 = hhrVar.f27844p;
                    View view2 = hhhVar3.f27808c;
                    if (view2 != null) {
                        hhhVar3.removeView(view2);
                    }
                    hhrVar.f27835g.clear();
                    int size2 = arrayList2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        Pair pair = (Pair) arrayList2.get(i4);
                        if (((hhs) pair.first).f27857c && (view = (hhhVar = hhrVar.f27844p).f27808c) != null) {
                            hhhVar.removeView(view);
                            hhhVar.addView(hhhVar.f27808c);
                        }
                        hhe hheVar2 = new hhe(hhrVar.f27831c, ((hhs) pair.first).f27855a);
                        TypedValue typedValue = new TypedValue();
                        hheVar2.getContext().getTheme().resolveAttribute(R.attr.selectableItemBackgroundBorderless, typedValue, true);
                        hheVar2.setBackgroundResource(typedValue.resourceId);
                        if (hheVar2.f27797c.activityInfo.packageName.equals(hheVar2.getContext().getPackageName())) {
                            hheVar2.setContentDescription(hheVar2.f27797c.loadLabel(hheVar2.f27798d));
                        } else {
                            hheVar2.setContentDescription(hhe.m10289a(hheVar2.f27797c, hheVar2.f27798d, hheVar2.getContext().getResources()));
                        }
                        hheVar2.setVisibility(8);
                        hheVar2.setOnClickListener(new ggf(hheVar2, hhrVar.f27847s, 4, null, null, null, null));
                        hheVar2.setOnTouchListener(new cln(hhrVar, 9));
                        hheVar2.setRotation(jvh.m13573u(hhrVar.f27840l));
                        Drawable drawable = (Drawable) pair.second;
                        if (hhrVar.f27829a) {
                            hheVar2.setImageDrawable(drawable);
                        } else {
                            TrafficStats.setThreadStatsTag(768);
                            bpn bpnVarMo2855h = box.m2827c(hheVar2.getContext()).m2863c().m2851d(drawable).mo2855h(cab.m3345a());
                            int dimensionPixelSize = hheVar2.getContext().getResources().getDimensionPixelSize(C0100R.dimen.social_share_menu_icon_size);
                            ((bpn) bpnVarMo2855h.m3315u(dimensionPixelSize, dimensionPixelSize)).m2858k(hheVar2);
                        }
                        hhh hhhVar4 = hhrVar.f27844p;
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams.gravity = 1;
                        if (hhhVar4.f27807b.isEmpty()) {
                            hhhVar4.f27812g.m13087W(hheVar2);
                        }
                        hhhVar4.f27807b.add(hheVar2);
                        hhhVar4.addView(hheVar2, layoutParams);
                        hhrVar.f27835g.add((hhs) pair.first);
                    }
                    nqfVar.mo14894e(true);
                }
            }
        }, jvh.m13554b());
        return nqfVarM17621g;
    }

    @Override // p000.hhi
    /* JADX INFO: renamed from: b */
    public final nps mo10299b() {
        final nqf nqfVarM17621g = nqf.m17621g();
        int i = this.f27846r;
        if (i == 0) {
            throw null;
        }
        if (i == 2) {
            nqfVarM17621g.mo14894e(Boolean.FALSE);
            return nqfVarM17621g;
        }
        this.f27846r = 2;
        hhc hhcVar = this.f27828D;
        hhcVar.f27789a.resetTransition();
        hhcVar.setOnClickListener(hhcVar.f27790b);
        hhcVar.setContentDescription(hhcVar.getContext().getString(C0100R.string.accessibility_open_social_share));
        m10307m(this.f27837i, this.f27843o, m10311j(this.f27840l, ((hzp) this.f27833e.mo6051a()).f30074a.f30073i));
        m10308n(this.f27827C);
        if (!this.f27851w.mo6184l(dib.f11323bd) || ((Boolean) this.f27832d.mo10031c(gzy.f27006R)).booleanValue() || this.f27829a) {
            Animator animatorM10293d = this.f27844p.m10293d();
            this.f27845q = animatorM10293d;
            animatorM10293d.addListener(jvh.m13544B(new Consumer() { // from class: hhk
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    nqfVarM17621g.mo14894e(Boolean.TRUE);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }));
        } else {
            hhh hhhVar = this.f27844p;
            aip aipVar = new aip() { // from class: hhj
                @Override // p000.aip
                /* JADX INFO: renamed from: a */
                public final void mo775a() {
                    nqfVarM17621g.mo14894e(Boolean.TRUE);
                }
            };
            Animator animatorM10293d2 = hhhVar.m10293d();
            ValueAnimator valueAnimator = (ValueAnimator) animatorM10293d2;
            valueAnimator.setIntValues(0, hhhVar.m10292c() + hhhVar.m10290a(C0100R.dimen.social_share_menu_bounce_height));
            valueAnimator.setInterpolator(new DecelerateInterpolator());
            valueAnimator.addListener(new hhg(hhhVar, aipVar));
            this.f27845q = animatorM10293d2;
        }
        this.f27845q.addListener(new hhp(this));
        this.f27845q.start();
        return nqfVarM17621g;
    }

    @Override // p000.hhi
    /* JADX INFO: renamed from: d */
    public final void mo10301d(View view, View view2) {
        this.f27836h = (ConstraintLayout) view.findViewById(C0100R.id.social_share_root_layout);
        ConstraintLayout constraintLayout = (ConstraintLayout) view2.findViewById(C0100R.id.social_share_layout);
        this.f27837i = constraintLayout;
        this.f27827C = (FrameLayout) constraintLayout.findViewById(C0100R.id.social_share_menu_container);
        this.f27826B = (FrameLayout) view.findViewById(C0100R.id.social_share_menu_container);
        this.f27843o = this.f27837i.findViewById(C0100R.id.thumbnail_button_for_align);
        this.f27842n = view.findViewById(C0100R.id.thumbnail_button_for_align);
        this.f27837i.setOnTouchListener(new cln(this, 10));
        this.f27838j = new GestureDetector(this.f27831c, new hhq(this));
        hho hhoVar = new hho(this, this.f27831c);
        this.f27828D = hhoVar;
        hhoVar.f27789a = new TransitionDrawable(new Drawable[]{hhoVar.m10285a(C0100R.drawable.quantum_ic_keyboard_arrow_up_white_18), hhoVar.m10285a(C0100R.drawable.quantum_ic_close_white_24)});
        TypedValue typedValue = new TypedValue();
        hhoVar.getContext().getTheme().resolveAttribute(R.attr.selectableItemBackgroundBorderless, typedValue, true);
        hhoVar.setBackgroundResource(typedValue.resourceId);
        hhoVar.setImageDrawable(hhoVar.f27789a);
        this.f27828D.setOnTouchListener(new cln(this, 11));
        int dimensionPixelSize = this.f27831c.getResources().getDimensionPixelSize(C0100R.dimen.social_share_menu_inset_horizontal);
        int dimensionPixelSize2 = view.getResources().getConfiguration().getLayoutDirection() == 1 ? 0 : this.f27831c.getResources().getDimensionPixelSize(C0100R.dimen.social_share_menu_notification_dot_inset);
        idn idnVar = new idn(this.f27831c, this.f27828D);
        this.f27839k = idnVar;
        idnVar.m11122c(0, 0, dimensionPixelSize + dimensionPixelSize2);
        hhh hhhVar = new hhh(this.f27831c, this.f27829a);
        this.f27844p = hhhVar;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(hhhVar.getContext().getResources().getColor(C0100R.color.social_share_menu_background_color, null));
        hhhVar.f27809d = gradientDrawable;
        int iM10290a = hhhVar.m10290a(C0100R.dimen.social_share_menu_width);
        int iM10290a2 = hhhVar.m10290a(C0100R.dimen.social_share_menu_inset_horizontal);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iM10290a + iM10290a2 + iM10290a2, -2);
        layoutParams.gravity = 1;
        hhhVar.setOrientation(1);
        hhhVar.setLayoutParams(layoutParams);
        hhhVar.setBackground(new InsetDrawable((Drawable) hhhVar.f27809d, hhhVar.m10290a(C0100R.dimen.social_share_menu_inset_horizontal), 0, hhhVar.m10290a(C0100R.dimen.social_share_menu_inset_horizontal), 0));
        hhhVar.setGravity(48);
        hhhVar.setVisibility(8);
        hhh hhhVar2 = this.f27844p;
        hhc hhcVar = this.f27828D;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        hhhVar2.f27810e = hhcVar;
        hhhVar2.f27812g.m13087W(hhcVar);
        hhhVar2.addView(hhcVar, layoutParams2);
        this.f27826B.addView(this.f27844p);
        this.f27852x.setOnTouchListener(new cln(this, 12));
        this.f27849u.setLayoutListener(new BottomBarLayoutListener() { // from class: hhn
            @Override // com.google.android.apps.camera.bottombar.BottomBarLayoutListener
            public final void onBottomBarLayoutChange() {
                hhr hhrVar = this.f27821a;
                int i = hhrVar.f27846r;
                if (i == 2) {
                    hhr.m10307m(hhrVar.f27837i, hhrVar.f27843o, hhrVar.m10311j(hhrVar.f27840l, ((hzp) hhrVar.f27833e.mo6051a()).f30074a.f30073i));
                    return;
                }
                if (i == 3) {
                    int i2 = 8;
                    hhrVar.f27836h.removeCallbacks(new hfr(hhrVar, i2));
                    if (jpd.m13431l(((hzp) hhrVar.f27833e.mo6051a()).f30074a.f30073i)) {
                        hhrVar.f27836h.setVisibility(8);
                        hhrVar.f27836h.post(new hfr(hhrVar, i2));
                    }
                }
            }
        });
    }

    @Override // p000.hhi
    /* JADX INFO: renamed from: e */
    public final void mo10302e(ilk ilkVar) {
        this.f27840l = ilkVar;
        if (this.f27837i.getWidth() == 0 || this.f27837i.getHeight() == 0) {
            this.f27837i.measure(View.MeasureSpec.makeMeasureSpec(((ViewGroup) this.f27837i.getParent()).getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(((ViewGroup) this.f27837i.getParent()).getMeasuredHeight(), 1073741824));
        }
        Collection$EL.forEach(this.f27844p.f27807b, new gyc(ilkVar, 10));
        jiy.m13270ae(this.f27831c, this.f27837i, ilkVar);
        jiy.m13271af(this.f27831c, this.f27837i, ilkVar);
    }

    @Override // p000.hhi
    /* JADX INFO: renamed from: f */
    public final void mo10303f() {
        Collection$EL.forEach(this.f27844p.f27807b, fax.f21160m);
    }

    @Override // p000.hhi
    /* JADX INFO: renamed from: g */
    public final void mo10304g() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f27835g;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            hhs hhsVar = (hhs) arrayList2.get(i);
            if (!hhsVar.f27858d) {
                arrayList.add(hhsVar.f27855a.activityInfo.packageName);
            }
        }
        Collection$EL.forEach(this.f27844p.f27807b, new gyc(arrayList, 20));
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.util.List] */
    @Override // p000.hhi
    /* JADX INFO: renamed from: h */
    public final void mo10305h(Runnable runnable) {
        Animator animator = this.f27845q;
        if (animator != null) {
            animator.cancel();
        }
        this.f27841m = runnable;
        int i = this.f27846r;
        if (i == 0) {
            throw null;
        }
        if (i == 3) {
            runnable.run();
            return;
        }
        this.f27846r = 3;
        this.f27853y.mo10033e(gzy.f27006R, true);
        this.f27849u.setSocialShareState(true);
        m10307m(this.f27836h, this.f27842n, m10311j(this.f27840l, ((hzp) this.f27833e.mo6051a()).f30074a.f30073i));
        m10308n(this.f27826B);
        hhc hhcVar = this.f27828D;
        hhcVar.f27789a.setCrossFadeEnabled(true);
        hhcVar.f27789a.startTransition(0);
        hhcVar.setOnClickListener(hhcVar.f27791c);
        hhcVar.setContentDescription(hhcVar.getContext().getString(C0100R.string.accessibility_close_social_share));
        hhh hhhVar = this.f27844p;
        hhhVar.setAlpha(1.0f);
        hhhVar.m10297h(2);
        jfs jfsVar = hhhVar.f27812g;
        jvd.m13538a();
        ?? r0 = jfsVar.f33914a;
        int size = r0.size();
        for (int i2 = 0; i2 < size; i2++) {
            hhd hhdVar = (hhd) r0.get(i2);
            if (hhdVar != null) {
                hhdVar.mo10287c();
            }
        }
        int height = hhhVar.getHeight();
        int iM10290a = hhhVar.m10290a(C0100R.dimen.social_share_menu_top_padding);
        int iM10290a2 = hhhVar.m10290a(C0100R.dimen.social_share_menu_item_height);
        int iM10290a3 = hhhVar.m10290a(C0100R.dimen.social_share_main_item_height);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(height, iM10290a + (iM10290a2 * hhhVar.f27807b.size()) + iM10290a3 + hhhVar.m10290a(C0100R.dimen.social_share_menu_bottom_padding));
        valueAnimatorOfInt.setDuration(hhhVar.f27806a.toMillis());
        valueAnimatorOfInt.addListener(jvh.m13545C(new gyc(hhhVar, 9)));
        valueAnimatorOfInt.addListener(jvh.m13544B(new gyc(hhhVar, 11)));
        valueAnimatorOfInt.addUpdateListener(new afx(hhhVar, 15));
        valueAnimatorOfInt.addListener(jvh.m13545C(new gyc(this, 17)));
        valueAnimatorOfInt.addListener(jvh.m13544B(new gyc(this, 18)));
        mwn mwnVarM17090e = mws.m17090e();
        mwnVarM17090e.m17082g(valueAnimatorOfInt);
        Collection$EL.stream(this.f27844p.f27807b).map(hgq.f27720n).forEachOrdered(new gyc(mwnVarM17090e, 19));
        m10309o(mwnVarM17090e.m17081f());
    }

    @Override // p000.hhi
    /* JADX INFO: renamed from: i */
    public final void mo10306i(AmbientModeSupport.AmbientController ambientController) {
        this.f27847s = ambientController;
        hhc hhcVar = this.f27828D;
        if (hhcVar != null) {
            hhcVar.f27792d = ambientController;
            hhcVar.f27790b = new flr(ambientController, 5, null, null, null, null);
            hhcVar.f27791c = new flr(ambientController, 6, null, null, null, null);
            hhcVar.setOnClickListener(hhcVar.f27790b);
        }
    }

    /* JADX INFO: renamed from: j */
    public final Rect m10311j(ilk ilkVar, hzj hzjVar) {
        Rect rect;
        Rect rect2 = new Rect();
        ilk uiOrientation = this.f27848t.getUiOrientation();
        hzp hzpVar = (hzp) this.f27833e.mo6051a();
        Size size = hzpVar.f30075b.f30038b;
        if (jpd.m13431l(hzjVar)) {
            int x = (int) this.f27848t.getX();
            int y = (int) this.f27848t.getY();
            rect = new Rect(x, y, this.f27848t.getWidth() + x, this.f27848t.getHeight() + y);
        } else {
            rect = hzpVar.f30075b.f30045i;
        }
        Point point = new Point();
        ilk ilkVar2 = ilk.PORTRAIT;
        switch (ilkVar) {
            case PORTRAIT:
                point.x = rect.left;
                point.y = m10310p(hzjVar, uiOrientation) ? rect.top - rect.width() : rect.top;
                break;
            case LANDSCAPE:
                point.x = (size.getHeight() - rect.height()) - rect.top;
                point.y = rect.left;
                break;
            case REVERSE_LANDSCAPE:
                point.x = rect.top;
                point.y = (size.getWidth() - rect.left) - rect.width();
                break;
            case REVERSE_PORTRAIT:
                point.x = size.getWidth() - rect.left;
                point.y = rect.top;
                break;
        }
        int width = this.f27854z.getWidth() - this.f27852x.getWidth();
        int height = (this.f27854z.getHeight() - this.f27852x.getHeight()) / 2;
        int i = width / 2;
        if (m10310p(hzjVar, uiOrientation)) {
            rect2.left = point.x + this.f27854z.getTop() + i;
            rect2.top = point.y + (this.f27848t.getWidth() - this.f27854z.getRight()) + height;
        } else {
            rect2.left = point.x + this.f27854z.getLeft() + i;
            rect2.top = point.y + this.f27854z.getTop() + height;
        }
        rect2.right = rect2.left + this.f27852x.getWidth();
        rect2.bottom = rect2.top + this.f27852x.getHeight();
        return rect2;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m10313l() {
        return ((Activity) this.f27831c).isDestroyed() || ((Activity) this.f27831c).isFinishing();
    }

    @Override // p000.hhi
    /* JADX INFO: renamed from: c */
    public final void mo10300c(boolean z) {
        int i = this.f27846r;
        if (i == 0) {
            throw null;
        }
        if (i == 1) {
            return;
        }
        this.f27846r = 1;
        this.f27849u.setSocialShareState(false);
        if (!z) {
            hhh hhhVar = this.f27844p;
            hhhVar.setVisibility(8);
            hhhVar.m10295f(false);
            int i2 = hhhVar.f27811f;
            if (i2 == 0) {
                throw null;
            }
            int iM10291b = i2 == 2 ? hhhVar.m10291b() : 0;
            ViewGroup.LayoutParams layoutParams = hhhVar.getLayoutParams();
            layoutParams.height = iM10291b;
            if (hhhVar.f27811f == 1) {
                hhhVar.setAlpha(0.0f);
            }
            hhhVar.setLayoutParams(layoutParams);
            Collection$EL.forEach(this.f27844p.f27807b, fax.f21159l);
            return;
        }
        mwn mwnVarM17090e = mws.m17090e();
        hhh hhhVar2 = this.f27844p;
        int[] iArr = new int[2];
        iArr[0] = hhhVar2.getHeight();
        int i3 = hhhVar2.f27811f;
        if (i3 == 0) {
            throw null;
        }
        iArr[1] = i3 == 2 ? hhhVar2.m10291b() : 0;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iArr);
        if (hhhVar2.f27811f == 1) {
            valueAnimatorOfInt.setDuration(inw.f31616a.toMillis());
        } else {
            valueAnimatorOfInt.setDuration(hhhVar2.f27806a.toMillis());
        }
        valueAnimatorOfInt.addListener(jvh.m13545C(new gyc(hhhVar2, 15)));
        valueAnimatorOfInt.addListener(jvh.m13544B(new gyc(hhhVar2, 16)));
        valueAnimatorOfInt.addUpdateListener(new afx(hhhVar2, 14));
        mwnVarM17090e.m17082g(valueAnimatorOfInt);
        Collection$EL.stream(this.f27844p.f27807b).map(hgq.f27721o).forEachOrdered(new gyc(mwnVarM17090e, 19));
        m10309o(mwnVarM17090e.m17081f());
    }

    /* JADX INFO: renamed from: k */
    public final void m10312k() {
        int i = this.f27844p.f27811f;
        if (i == 0) {
            throw null;
        }
        if (i == 1) {
            C1178zm c1178zm = (C1178zm) this.f27827C.getLayoutParams();
            c1178zm.bottomMargin = this.f27852x.getHeight() / 2;
            this.f27827C.setLayoutParams(c1178zm);
            this.f27827C.requestLayout();
            return;
        }
        C1178zm c1178zm2 = (C1178zm) this.f27826B.getLayoutParams();
        c1178zm2.bottomMargin = (this.f27852x.getHeight() / 2) - (this.f27831c.getResources().getDimensionPixelSize(C0100R.dimen.rounded_thumbnail_diameter) / 2);
        this.f27826B.setLayoutParams(c1178zm2);
        this.f27826B.requestLayout();
    }
}
