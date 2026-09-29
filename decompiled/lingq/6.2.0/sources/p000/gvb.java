package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.SpannableString;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.lifecycle.Lifecycle$State;
import androidx.loader.content.ModernAsyncTask$Status;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.cloudmessaging.zzt;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zay;
import com.google.android.gms.internal.measurement.C0962f;
import com.google.android.gms.internal.play_billing.AbstractC0985a;
import com.google.android.gms.internal.play_billing.zzbw;
import com.google.android.gms.internal.play_billing.zzjd;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.C1043b;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzjk;
import com.google.android.gms.measurement.internal.zzoh;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import com.google.android.gms.signin.internal.zak;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.common.collect.ImmutableMap;
import com.google.common.util.concurrent.AbstractC1118h;
import com.google.common.util.concurrent.AbstractC1120j;
import com.google.common.util.concurrent.ListenableFuture;
import com.iterable.iterableapi.AsyncTaskC1217m;
import com.lingq.core.designsystem.R$dimen;
import com.lingq.core.domain.model.lesson.Lesson;
import com.lingq.feature.reader.R$id;
import com.lingq.feature.reader.old.C2412n;
import com.lingq.feature.reader.old.ReaderFragment;
import com.lingq.feature.reader.old.ReaderPageFragment;
import com.lingq.feature.reader.pagination.p015ui.LessonTextView;
import com.lingq.feature.reader.shared.p018ui.components.StaticLayoutTextView;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Result;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes2.dex */
public final class gvb implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41407a;

    /* JADX INFO: renamed from: b */
    public final Object f41408b;

    /* JADX INFO: renamed from: c */
    public final Object f41409c;

    public gvb(C1043b c1043b, oub oubVar) {
        this.f41407a = 19;
        this.f41408b = oubVar;
        Objects.requireNonNull(c1043b);
        this.f41409c = c1043b;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0041 A[Catch: CancellationException | ExecutionException -> 0x0024, CancellationException | ExecutionException -> 0x0024, TryCatch #1 {CancellationException | ExecutionException -> 0x0024, blocks: (B:3:0x0008, B:5:0x001f, B:16:0x0030, B:16:0x0030, B:18:0x0041, B:18:0x0041, B:20:0x004d, B:20:0x004d, B:26:0x005f, B:26:0x005f, B:28:0x0063, B:28:0x0063, B:10:0x0027, B:31:0x009d, B:31:0x009d), top: B:37:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x004d A[Catch: CancellationException | ExecutionException -> 0x0024, CancellationException | ExecutionException -> 0x0024, TRY_LEAVE, TryCatch #1 {CancellationException | ExecutionException -> 0x0024, blocks: (B:3:0x0008, B:5:0x001f, B:16:0x0030, B:16:0x0030, B:18:0x0041, B:18:0x0041, B:20:0x004d, B:20:0x004d, B:26:0x005f, B:26:0x005f, B:28:0x0063, B:28:0x0063, B:10:0x0027, B:31:0x009d, B:31:0x009d), top: B:37:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    private final void m12919a() {
        pc0 pc0Var;
        ImmutableMap immutableMap;
        ImmutableMap immutableMap2;
        zcd zcdVar;
        t9d t9dVar = (t9d) this.f41408b;
        try {
            udd uddVar = (udd) AbstractC1118h.m6398b((C3817z1) this.f41409c);
            pc0 pc0Var2 = new pc0(uddVar, new xp7(6, 2, 4));
            boolean z = t9dVar.f62032e;
            if (z || (pc0Var = t9dVar.f62028a) == null) {
                synchronized (t9dVar) {
                    if (!z) {
                        pc0Var = t9dVar.f62028a;
                        if (pc0Var != null) {
                            immutableMap = (ImmutableMap) pc0Var.f55940d;
                            immutableMap2 = (ImmutableMap) pc0Var2.f55940d;
                            immutableMap.getClass();
                            if (!xnb.m24620a(immutableMap2, immutableMap)) {
                                zcdVar = (zcd) t9dVar.f62029b.f11848e.get();
                                if (zcdVar != null) {
                                    zcdVar.zza();
                                    return;
                                }
                                return;
                            }
                        }
                    }
                    t9dVar.f62028a = pc0Var2;
                    ((AtomicInteger) t9dVar.f62034g.f53173a).incrementAndGet();
                }
            } else {
                immutableMap = (ImmutableMap) pc0Var.f55940d;
                immutableMap2 = (ImmutableMap) pc0Var2.f55940d;
                immutableMap.getClass();
                if (!xnb.m24620a(immutableMap2, immutableMap)) {
                    zcdVar = (zcd) t9dVar.f62029b.f11848e.get();
                    if (zcdVar != null) {
                        zcdVar.zza();
                        return;
                    }
                    return;
                }
            }
            if (t9dVar.f62032e) {
                C0962f c0962f = t9dVar.f62029b;
                d2d d2dVar = (d2d) c0962f.f11847d.get();
                String strM22709s = uddVar.m22709s();
                d2dVar.getClass();
                strM22709s.getClass();
                C3555s c3555sM9998b = d2d.m9998b(d2dVar.f34881a.m16543d(strM22709s));
                q8d q8dVar = new q8d(t9dVar, 0);
                c26 c26VarM5409a = c0962f.m5409a();
                int i = AbstractRunnableC3630u.f63155l;
                C3593t c3593t = new C3593t(c3555sM9998b, Throwable.class, q8dVar);
                c3555sM9998b.mo52a(c3593t, AbstractC1120j.m6405b(c26VarM5409a, c3593t));
            }
        } catch (CancellationException | ExecutionException e) {
            if (e.getCause() instanceof SecurityException) {
                return;
            }
            String str = t9dVar.f62030c;
            Log.w("FlagStore", AbstractC3393o1.m17739n(new StringBuilder(String.valueOf(str).length() + 64), "Unable to update local snapshot for ", str, ", may result in stale flags."), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:378:0x02bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable thMo19563d;
        bg2 bg2Var;
        C3663uw c3663uw;
        int[] iArr;
        int i;
        xz7 xz7Var;
        xz7 xz7Var2;
        lx3 lx3Var;
        Long lValueOf;
        int i2 = 0;
        Object[] objArr = 0;
        int i3 = 1;
        switch (this.f41407a) {
            case 0:
                Object[] objArr2 = false;
                gld gldVar = (gld) this.f41409c;
                vwb vwbVar = (vwb) this.f41408b;
                if ((vwbVar instanceof ytb) && (thMo19563d = ((ytb) vwbVar).mo19563d()) != null) {
                    gldVar.m12743g(thMo19563d);
                    return;
                }
                try {
                    if (!vwbVar.isDone()) {
                        throw new IllegalStateException(xcd.m24459b("Future was expected to be done: %s", vwbVar));
                    }
                    while (true) {
                        try {
                            Object obj = vwbVar.get();
                            if (objArr2 != false) {
                                Thread.currentThread().interrupt();
                            }
                            Integer num = (Integer) obj;
                            int iIntValue = num.intValue();
                            hvb hvbVar = (hvb) gldVar.f40987d;
                            if (iIntValue <= 0) {
                                ((Runnable) gldVar.f40986c).run();
                                return;
                            }
                            int i4 = gldVar.f40984a;
                            int iIntValue2 = num.intValue();
                            hvbVar.getClass();
                            qc0 qc0VarM24184a = wwb.m24184a(iIntValue2, "Billing override value was set by a license tester.");
                            hvbVar.m13510H(zzjd.LICENSE_TESTER_BILLING_OVERRIDE, i4, qc0VarM24184a);
                            ((lk1) gldVar.f40985b).accept(qc0VarM24184a);
                            return;
                        } catch (InterruptedException unused) {
                            objArr2 = true;
                        } catch (Throwable th) {
                            if (objArr2 != false) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    }
                } catch (ExecutionException e) {
                    gldVar.m12743g(e.getCause());
                    return;
                } catch (Throwable th2) {
                    gldVar.m12743g(th2);
                    return;
                }
                break;
            case 1:
                RunnableC3626tw runnableC3626tw = (RunnableC3626tw) this.f41409c;
                C3663uw c3663uw2 = (C3663uw) runnableC3626tw.f62975e;
                if (c3663uw2.f64455g == runnableC3626tw.f62972b) {
                    List list = (List) runnableC3626tw.f62974d;
                    bg2 bg2Var2 = (bg2) this.f41408b;
                    c3663uw2.f64453e = list;
                    c3663uw2.f64454f = Collections.unmodifiableList(list);
                    qn3 qn3Var = c3663uw2.f64449a;
                    int[] iArr2 = bg2Var2.f8490b;
                    ArrayList arrayList = bg2Var2.f8489a;
                    int i5 = bg2Var2.f8493e;
                    vj6 vj6Var = bg2Var2.f8492d;
                    wb0 wb0Var = new wb0(qn3Var);
                    ArrayDeque arrayDeque = new ArrayDeque();
                    int i6 = bg2Var2.f8494f;
                    int size = arrayList.size() - 1;
                    int i7 = i6;
                    int i8 = i5;
                    while (size >= 0) {
                        ag2 ag2Var = (ag2) arrayList.get(size);
                        int i9 = ag2Var.f597a;
                        int i10 = ag2Var.f599c;
                        int i11 = i3;
                        int i12 = i9 + i10;
                        int i13 = ag2Var.f598b;
                        int i14 = i13 + i10;
                        while (i8 > i12) {
                            i8--;
                            int i15 = iArr2[i8];
                            if ((i15 & 12) != 0) {
                                c3663uw = c3663uw2;
                                int i16 = i15 >> 4;
                                iArr = iArr2;
                                i = i12;
                                cg2 cg2VarM3693a = bg2.m3693a(arrayDeque, i16, false);
                                if (cg2VarM3693a != null) {
                                    int i17 = (i5 - cg2VarM3693a.f10011b) - 1;
                                    wb0Var.mo12582a(i8, i17);
                                    if ((i15 & 4) != 0) {
                                        vj6Var.m23346v(i8, i16);
                                        wb0Var.mo12585f(i17, i11);
                                    }
                                } else {
                                    boolean z = i11;
                                    arrayDeque.add(new cg2(i8, (i5 - i8) - (z ? 1 : 0), z));
                                }
                            } else {
                                c3663uw = c3663uw2;
                                iArr = iArr2;
                                i = i12;
                                wb0Var.mo12584d(i8, i11);
                                i5--;
                            }
                            i12 = i;
                            c3663uw2 = c3663uw;
                            iArr2 = iArr;
                            i11 = 1;
                        }
                        C3663uw c3663uw3 = c3663uw2;
                        int[] iArr3 = iArr2;
                        while (i7 > i14) {
                            i7--;
                            int i18 = bg2Var2.f8491c[i7];
                            if ((i18 & 12) != 0) {
                                int i19 = i18 >> 4;
                                bg2Var = bg2Var2;
                                cg2 cg2VarM3693a2 = bg2.m3693a(arrayDeque, i19, true);
                                if (cg2VarM3693a2 == null) {
                                    arrayDeque.add(new cg2(i7, i5 - i8, false));
                                } else {
                                    wb0Var.mo12582a((i5 - cg2VarM3693a2.f10011b) - 1, i8);
                                    if ((i18 & 4) != 0) {
                                        vj6Var.m23346v(i19, i7);
                                        wb0Var.mo12585f(i8, 1);
                                    }
                                }
                            } else {
                                bg2Var = bg2Var2;
                                wb0Var.mo12583c(i8, 1);
                                i5++;
                            }
                            bg2Var2 = bg2Var;
                        }
                        bg2 bg2Var3 = bg2Var2;
                        int i20 = i13;
                        int i21 = i9;
                        for (int i22 = 0; i22 < i10; i22++) {
                            if ((iArr3[i21] & 15) == 2) {
                                vj6Var.m23346v(i21, i20);
                                wb0Var.mo12585f(i21, 1);
                            }
                            i21++;
                            i20++;
                        }
                        size--;
                        bg2Var2 = bg2Var3;
                        i7 = i13;
                        i8 = i9;
                        c3663uw2 = c3663uw3;
                        iArr2 = iArr3;
                        i3 = 1;
                    }
                    wb0Var.m23830b();
                    c3663uw2.m22959a();
                    return;
                }
                return;
            case 2:
                a72 a72Var = (a72) this.f41409c;
                ArrayList<z62> arrayList2 = (ArrayList) this.f41408b;
                for (z62 z62Var : arrayList2) {
                    o38 o38Var = z62Var.f70979a;
                    int i23 = z62Var.f70980b;
                    int i24 = z62Var.f70981c;
                    int i25 = z62Var.f70982d;
                    int i26 = z62Var.f70983e;
                    a72Var.getClass();
                    View view = o38Var.f53781a;
                    int i27 = i25 - i23;
                    int i28 = i26 - i24;
                    if (i27 != 0) {
                        view.animate().translationX(0.0f);
                    }
                    if (i28 != 0) {
                        view.animate().translationY(0.0f);
                    }
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                    a72Var.f315p.add(o38Var);
                    viewPropertyAnimatorAnimate.setDuration(a72Var.f64746e).setListener(new w62(a72Var, o38Var, i27, view, i28, viewPropertyAnimatorAnimate)).start();
                }
                arrayList2.clear();
                a72Var.f312m.remove(arrayList2);
                return;
            case 3:
                oj5 oj5VarM18040f = oj5.m18040f();
                String str = da2.f35284e;
                StringBuilder sb = new StringBuilder("Scheduling work ");
                p8b p8bVar = (p8b) this.f41408b;
                sb.append(p8bVar.f55772a);
                oj5VarM18040f.m18042a(str, sb.toString());
                ((da2) this.f41409c).f35285a.mo21482e(p8bVar);
                return;
            case 4:
                ((AsyncTaskC1217m) this.f41408b).execute(((AsyncTaskC1217m) this.f41409c).f14059b);
                return;
            case 5:
                RunnableC3700vw runnableC3700vw = (RunnableC3700vw) this.f41409c;
                Object obj2 = this.f41408b;
                boolean z2 = runnableC3700vw.f65999c.get();
                leb lebVar = runnableC3700vw.f66001e;
                if (z2) {
                    if (lebVar.f49572h == runnableC3700vw) {
                        SystemClock.uptimeMillis();
                        lebVar.f49572h = null;
                        lebVar.m16153b();
                    }
                } else if (lebVar.f49571g != runnableC3700vw) {
                    if (lebVar.f49572h == runnableC3700vw) {
                        SystemClock.uptimeMillis();
                        lebVar.f49572h = null;
                        lebVar.m16153b();
                    }
                } else if (!lebVar.f49567c) {
                    SystemClock.uptimeMillis();
                    lebVar.f49571g = null;
                    ih5 ih5Var = lebVar.f49565a;
                    if (ih5Var != null) {
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            ih5Var.m23765i(obj2);
                        } else {
                            ih5Var.m23764g(obj2);
                        }
                    }
                }
                runnableC3700vw.f65998b = ModernAsyncTask$Status.FINISHED;
                return;
            case 6:
                ReaderFragment readerFragment = (ReaderFragment) this.f41408b;
                if (readerFragment.f5709m0.f66586d.isAtLeast(Lifecycle$State.STARTED)) {
                    v65 v65Var = (v65) this.f41409c;
                    bh4[] bh4VarArr = ReaderFragment.f28218P0;
                    Lesson lesson = v65Var.f64920a;
                    we3 we3VarM9288U0 = readerFragment.m9288U0();
                    ViewPager2 viewPager2 = we3VarM9288U0.f66709o;
                    MaterialButton materialButton = we3VarM9288U0.f66697c;
                    cq4 cq4Var = we3VarM9288U0.f66704j;
                    float measuredWidth = viewPager2.getMeasuredWidth();
                    ViewPager2 viewPager3 = we3VarM9288U0.f66709o;
                    float measuredHeight = viewPager3.getMeasuredHeight();
                    if (measuredWidth < 0.0f || measuredHeight < 0.0f) {
                        measuredWidth = viewPager3.getWidth();
                        measuredHeight = viewPager3.getHeight();
                    }
                    float f = measuredWidth;
                    float f2 = measuredHeight;
                    RelativeLayout relativeLayout = (RelativeLayout) cq4Var.f34380d;
                    LinearLayout linearLayout = (LinearLayout) cq4Var.f34382f;
                    ImageView imageView = cq4Var.f34381e;
                    relativeLayout.setVisibility(4);
                    imageView.setVisibility(4);
                    materialButton.setVisibility(4);
                    cq4Var.f34378b.setText(lesson.f19143b);
                    cq4Var.f34377a.setText(lesson.f19150i);
                    jfa.m14423f(imageView, lesson.f19146e, 14);
                    ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                    layoutParams.getClass();
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                    layoutParams2.removeRule(20);
                    layoutParams2.addRule(17, R$id.iv_lesson);
                    linearLayout.setLayoutParams(layoutParams2);
                    int i29 = (int) f;
                    relativeLayout.measure(View.MeasureSpec.makeMeasureSpec(i29, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    int measuredHeight2 = relativeLayout.getMeasuredHeight();
                    StaticLayoutTextView staticLayoutTextView = we3VarM9288U0.f66706l;
                    ViewGroup.LayoutParams layoutParams3 = staticLayoutTextView.getLayoutParams();
                    if (layoutParams3 == null) {
                        C3386nv.m17635v("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                        return;
                    }
                    RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
                    layoutParams4.topMargin = readerFragment.m2110l().getDimensionPixelSize(R$dimen.list_vertical_margin) + measuredHeight2;
                    staticLayoutTextView.setLayoutParams(layoutParams4);
                    relativeLayout.setVisibility(8);
                    imageView.setVisibility(8);
                    materialButton.measure(View.MeasureSpec.makeMeasureSpec(i29, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    int iM14419b = (((int) jfa.m14419b(readerFragment.m2090R(), (int) readerFragment.m2090R().getResources().getDimension(R$dimen.spacing_standard))) * 2) + materialButton.getMeasuredHeight();
                    materialButton.setVisibility(8);
                    t45 t45Var = new t45(f, f2, measuredHeight2, iM14419b, 0, 0);
                    ox9 ox9Var = new ox9(v65Var.f64923d, v65Var.f64924e, v65Var.f64925f, v65Var.f64926g, v65Var.f64927h, false);
                    jn8 jn8Var = new jn8(v65Var.f64928i, v65Var.f64929j, v65Var.f64930k, v65Var.f64931l, v65Var.f64932m, v65Var.f64933n);
                    j55 j55Var = new j55(readerFragment.m2090R());
                    String strMo4589b2 = readerFragment.m9290W0().f29340b.mo4589b2();
                    strMo4589b2.getClass();
                    j55Var.f45083j = strMo4589b2;
                    j55Var.f45080g = t45Var;
                    j55Var.f45081h = ox9Var;
                    j55Var.f45082i = jn8Var;
                    j55Var.m14299h(v65Var.f64921b);
                    List listM14293a = j55Var.m14293a(v65Var.f64922c);
                    C2412n c2412nM9290W0 = readerFragment.m9290W0();
                    c2412nM9290W0.getClass();
                    if (listM14293a.isEmpty()) {
                        return;
                    }
                    C3244l c3244l = c2412nM9290W0.f29269D0;
                    c3244l.getClass();
                    c3244l.m15572j(null, listM14293a);
                    return;
                }
                return;
            case 7:
                ReaderPageFragment readerPageFragment = (ReaderPageFragment) this.f41408b;
                Pair pair = (Pair) this.f41409c;
                LessonTextView lessonTextView = readerPageFragment.f28444F0;
                if (lessonTextView == null) {
                    fa4.m11636J("tvContent");
                    throw null;
                }
                CharSequence text = lessonTextView.getText();
                text.getClass();
                SpannableString spannableString = (SpannableString) text;
                zw8[] zw8VarArr = (zw8[]) spannableString.getSpans(0, spannableString.length(), zw8.class);
                zw8VarArr.getClass();
                int length = zw8VarArr.length;
                while (i2 < length) {
                    spannableString.removeSpan(zw8VarArr[i2]);
                    i2++;
                }
                String strMo4589b3 = readerPageFragment.m9299X0().f29223b.mo4589b2();
                int i30 = (pair == null || (xz7Var2 = (xz7) pair.f47623a) == null) ? -1 : xz7Var2.f69004a;
                int i31 = (pair == null || (xz7Var = (xz7) pair.f47624b) == null) ? -1 : xz7Var.f69005b;
                if (i30 == -1 || i31 == -1 || i30 >= i31 || i30 >= spannableString.length() || i31 > spannableString.length()) {
                    return;
                }
                Context contextM2090R = readerPageFragment.m2090R();
                LessonTextView lessonTextView2 = readerPageFragment.f28444F0;
                if (lessonTextView2 != null) {
                    spannableString.setSpan(new zw8(contextM2090R, lessonTextView2.getLayout(), strMo4589b3, i30, i31), i30, i31, 33);
                    return;
                } else {
                    fa4.m11636J("tvContent");
                    throw null;
                }
            case 8:
                ((lb3) this.f41408b).accept(this.f41409c);
                return;
            case 9:
                ita itaVar = ((SwipeDismissBehavior) this.f41409c).f12676a;
                if (itaVar == null || !itaVar.m14133f()) {
                    return;
                }
                ((View) this.f41408b).postOnAnimation(this);
                return;
            case 10:
                ListenableFuture listenableFuture = (ListenableFuture) this.f41408b;
                boolean zIsCancelled = listenableFuture.isCancelled();
                sm0 sm0Var = (sm0) this.f41409c;
                if (zIsCancelled) {
                    sm0Var.mo10141l(null);
                    return;
                }
                while (true) {
                    try {
                        try {
                            Object obj3 = listenableFuture.get();
                            if (objArr != 0) {
                                Thread.currentThread().interrupt();
                            }
                            sm0Var.resumeWith(obj3);
                            return;
                        } catch (ExecutionException e2) {
                            Throwable cause = e2.getCause();
                            cause.getClass();
                            sm0Var.resumeWith(new Result.Failure(cause));
                            return;
                        }
                    } catch (InterruptedException unused2) {
                        objArr = 1;
                    } catch (Throwable th3) {
                        if (objArr != 0) {
                            Thread.currentThread().interrupt();
                        }
                        throw th3;
                    }
                }
                break;
            case 11:
                ConnectionResult connectionResult = (ConnectionResult) this.f41408b;
                ucb ucbVar = (ucb) this.f41409c;
                so3 so3Var = ucbVar.f63730f;
                co3 co3Var = ucbVar.f63725a;
                scb scbVar = (scb) so3Var.f61103j.get(ucbVar.f63726b);
                if (scbVar == null) {
                    return;
                }
                if (connectionResult.f11637b != 0) {
                    scbVar.m21237l(connectionResult, null);
                    return;
                }
                ucbVar.f63729e = true;
                if (co3Var.mo3407r()) {
                    if (!ucbVar.f63729e || (lx3Var = ucbVar.f63727c) == null) {
                        return;
                    }
                    co3Var.m11610j(lx3Var, ucbVar.f63728d);
                    return;
                }
                try {
                    co3Var.m11610j(null, co3Var.mo3407r() ? co3Var.f10347z : Collections.EMPTY_SET);
                    return;
                } catch (SecurityException e3) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e3);
                    co3Var.m11609d("Failed to get service from broker.");
                    scbVar.m21237l(new ConnectionResult(10, null, null), null);
                    return;
                }
            case 12:
                edb edbVar = (edb) this.f41409c;
                zak zakVar = (zak) this.f41408b;
                edbVar.getClass();
                ConnectionResult connectionResult2 = zakVar.f12461b;
                if (connectionResult2.f11637b == 0) {
                    zay zayVar = zakVar.f12462c;
                    lda.m16130p(zayVar);
                    ConnectionResult connectionResult3 = zayVar.f11739c;
                    if (connectionResult3.f11637b != 0) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(connectionResult3)), new Exception());
                        edbVar.f37094m.m22675b(connectionResult3);
                        edbVar.f37093l.m11608c();
                        return;
                    }
                    ucb ucbVar2 = edbVar.f37094m;
                    lx3 lx3VarM5289r = zayVar.m5289r();
                    Set set = edbVar.f37091j;
                    ucbVar2.getClass();
                    if (lx3VarM5289r == null || set == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        ucbVar2.m22675b(new ConnectionResult(4, null, null));
                    } else {
                        ucbVar2.f63727c = lx3VarM5289r;
                        ucbVar2.f63728d = set;
                        if (ucbVar2.f63729e) {
                            ucbVar2.f63725a.m11610j(lx3VarM5289r, set);
                        }
                    }
                } else {
                    edbVar.f37094m.m22675b(connectionResult2);
                }
                edbVar.f37093l.m11608c();
                return;
            case 13:
                kc0 kc0Var = (kc0) this.f41408b;
                qc0 qc0Var = (qc0) this.f41409c;
                pc0 pc0Var = (pc0) kc0Var.f46998f.f63124c;
                tz1 tz1Var = kc0Var.f46998f;
                if (pc0Var != null) {
                    ((pc0) tz1Var.f63124c).m19061b(qc0Var, null);
                    return;
                } else {
                    AbstractC0985a.m5508i("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            case 14:
                ReferenceQueue referenceQueue = (ReferenceQueue) this.f41408b;
                while (!((Set) this.f41409c).isEmpty()) {
                    try {
                        awb awbVar = (awb) referenceQueue.remove();
                        if (awbVar.f7629a.remove(awbVar)) {
                            awbVar.clear();
                            awbVar.f7630b.getClass();
                        }
                    } catch (InterruptedException unused3) {
                    }
                }
                return;
            case 15:
                kc0 kc0Var2 = (kc0) this.f41408b;
                C3440oy c3440oy = (C3440oy) this.f41409c;
                zzjd zzjdVar = zzjd.EXECUTE_ASYNC_TIMEOUT;
                qc0 qc0Var2 = wwb.f67446k;
                kc0Var2.m15107z(zzjdVar, 9, qc0Var2);
                c3440oy.m18572k(qc0Var2, zzbw.m5669n());
                return;
            case 16:
                ServiceConnectionC3351mx serviceConnectionC3351mx = (ServiceConnectionC3351mx) this.f41409c;
                kjc kjcVar = ((ggc) serviceConnectionC3351mx.f51986c).f40788b;
                tic ticVar = kjcVar.f47439g;
                kjc.m15280l(ticVar);
                ticVar.mo12359D();
                Bundle bundle = new Bundle();
                bundle.putString("package_name", (String) serviceConnectionC3351mx.f51985b);
                try {
                    kqb kqbVar = (kqb) ((oqb) this.f41408b);
                    Parcel parcelM16773J = kqbVar.m16773J();
                    bqb.m4106c(parcelM16773J, bundle);
                    Parcel parcelM16772I = kqbVar.m16772I(parcelM16773J, 1);
                    Bundle bundle2 = (Bundle) bqb.m4105b(parcelM16772I, Bundle.CREATOR);
                    parcelM16772I.recycle();
                    if (bundle2 == null) {
                        xcc xccVar = kjcVar.f47438f;
                        kjc.m15280l(xccVar);
                        xccVar.f68080f.m17923a("Install Referrer Service returned a null response");
                    }
                    break;
                } catch (Exception e4) {
                    xcc xccVar2 = kjcVar.f47438f;
                    kjc.m15280l(xccVar2);
                    xccVar2.f68080f.m17924b(e4.getMessage(), "Exception occurred while retrieving the Install Referrer");
                }
                tic ticVar2 = kjcVar.f47439g;
                kjc.m15280l(ticVar2);
                ticVar2.mo12359D();
                throw new IllegalStateException("Unexpected call on client side");
            case 17:
                b9d b9dVar = (b9d) this.f41408b;
                IBinder iBinder = (IBinder) this.f41409c;
                synchronized (b9dVar) {
                    if (iBinder == null) {
                        b9dVar.m3493a("Null service connection");
                    } else {
                        try {
                            b9dVar.f8196c = new cdb(iBinder);
                            b9dVar.f8194a = 2;
                            ((ScheduledExecutorService) b9dVar.f8199f.f40986c).execute(new knc(b9dVar, i2));
                        } catch (RemoteException e5) {
                            b9dVar.m3493a(e5.getMessage());
                        }
                    }
                }
                return;
            case 18:
                C1043b c1043b = (C1043b) this.f41409c;
                c1043b.mo12359D();
                c1043b.m13744E();
                Bundle bundle3 = (Bundle) this.f41408b;
                String string = bundle3.getString("name");
                String string2 = bundle3.getString("origin");
                lda.m16127m(string);
                lda.m16127m(string2);
                lda.m16130p(bundle3.get("value"));
                kjc kjcVar2 = (kjc) c1043b.f60774a;
                if (!kjcVar2.m15282f()) {
                    xcc xccVar3 = kjcVar2.f47438f;
                    kjc.m15280l(xccVar3);
                    xccVar3.f68076I.m17923a("Conditional property not set since app measurement is disabled");
                    return;
                }
                zzpl zzplVar = new zzpl(bundle3.getLong("triggered_timestamp"), bundle3.get("value"), string, string2);
                try {
                    rad radVar = kjcVar2.f47441i;
                    kjc.m15278j(radVar);
                    bundle3.getString("app_id");
                    zzbh zzbhVarM20546j0 = radVar.m20546j0(bundle3.getString("triggered_event_name"), bundle3.getBundle("triggered_event_params"), string2, 0L, 0L, true);
                    kjc.m15278j(radVar);
                    bundle3.getString("app_id");
                    zzbh zzbhVarM20546j1 = radVar.m20546j0(bundle3.getString("timed_out_event_name"), bundle3.getBundle("timed_out_event_params"), string2, 0L, 0L, true);
                    bundle3.getString("app_id");
                    kjcVar2.m15287o().m23122W(new zzah(bundle3.getString("app_id"), string2, zzplVar, bundle3.getLong("creation_timestamp"), false, bundle3.getString("trigger_event_name"), zzbhVarM20546j1, bundle3.getLong("trigger_timeout"), zzbhVarM20546j0, bundle3.getLong("time_to_live"), radVar.m20546j0(bundle3.getString("expired_event_name"), bundle3.getBundle("expired_event_params"), string2, 0L, 0L, true)));
                    return;
                } catch (IllegalArgumentException unused4) {
                    return;
                }
            case 19:
                oub oubVar = (oub) this.f41408b;
                C1043b c1043b2 = (C1043b) this.f41409c;
                s6d s6dVar = ((kjc) c1043b2.f60774a).f47440h;
                kjc.m15279k(s6dVar);
                kjc kjcVar3 = (kjc) s6dVar.f60774a;
                qfc qfcVar = kjcVar3.f47437e;
                qfc qfcVar2 = kjcVar3.f47437e;
                kjc.m15278j(qfcVar);
                if (qfcVar.m19933K().m17590i(zzjk.ANALYTICS_STORAGE)) {
                    kjc.m15278j(qfcVar2);
                    kjcVar3.f47443k.getClass();
                    if (!qfcVar2.m19935M(System.currentTimeMillis())) {
                        kjc.m15278j(qfcVar2);
                        if (qfcVar2.f57716L.m19952g() != 0) {
                            kjc.m15278j(qfcVar2);
                            lValueOf = Long.valueOf(qfcVar2.f57716L.m19952g());
                        }
                    }
                    if (lValueOf == null) {
                        rad radVar2 = ((kjc) c1043b2.f60774a).f47441i;
                        kjc.m15278j(radVar2);
                        radVar2.m20552q0(oubVar, lValueOf.longValue());
                        return;
                    } else {
                        try {
                            oubVar.mo16549u(null);
                            return;
                        } catch (RemoteException e6) {
                            xcc xccVar4 = ((kjc) c1043b2.f60774a).f47438f;
                            kjc.m15280l(xccVar4);
                            xccVar4.f68080f.m17924b(e6, "getSessionId failed with exception");
                            return;
                        }
                    }
                }
                xcc xccVar5 = kjcVar3.f47438f;
                kjc.m15280l(xccVar5);
                xccVar5.f68085k.m17923a("Analytics storage consent denied; will not get session id");
                lValueOf = null;
                if (lValueOf == null) {
                    oubVar.mo16549u(null);
                    return;
                }
                rad radVar3 = ((kjc) c1043b2.f60774a).f47441i;
                kjc.m15278j(radVar3);
                radVar3.m20552q0(oubVar, lValueOf.longValue());
                return;
            case 20:
                C1043b c1043b3 = (C1043b) this.f41409c;
                kjc kjcVar4 = (kjc) c1043b3.f60774a;
                qfc qfcVar3 = kjcVar4.f47437e;
                xcc xccVar6 = kjcVar4.f47438f;
                kjc.m15278j(qfcVar3);
                qfcVar3.mo12359D();
                qfcVar3.mo12359D();
                mob mobVarM16960b = mob.m16960b(qfcVar3.m19930H().getString("dma_consent_settings", null));
                mob mobVar = (mob) this.f41408b;
                int i32 = mobVar.f51667a;
                if (!npc.m17587l(i32, mobVarM16960b.f51667a)) {
                    kjc.m15280l(xccVar6);
                    xccVar6.f68086l.m17924b(Integer.valueOf(i32), "Lower precedence consent source ignored, proposed source");
                    return;
                }
                SharedPreferences.Editor editorEdit = qfcVar3.m19930H().edit();
                editorEdit.putString("dma_consent_settings", mobVar.f51668b);
                editorEdit.apply();
                kjc.m15280l(xccVar6);
                xccVar6.f68076I.m17924b(mobVar, "Setting DMA consent(FE)");
                kjc kjcVar5 = (kjc) c1043b3.f60774a;
                if (kjcVar5.m15287o().m23113N()) {
                    v4d v4dVarM15287o = kjcVar5.m15287o();
                    v4dVarM15287o.mo12359D();
                    v4dVarM15287o.m13744E();
                    v4dVarM15287o.m23117R(new y3d(v4dVarM15287o, i3));
                    return;
                }
                v4d v4dVarM15287o2 = kjcVar5.m15287o();
                v4dVarM15287o2.mo12359D();
                v4dVarM15287o2.m13744E();
                if (v4dVarM15287o2.m23112M()) {
                    v4dVarM15287o2.m23117R(new k1d(v4dVarM15287o2, v4dVarM15287o2.m23119T(false), 1));
                    return;
                }
                return;
            case 21:
                kx9 kx9Var = (kx9) this.f41408b;
                wr9 wr9Var = (wr9) this.f41409c;
                int iDecrementAndGet = kx9Var.f48561b.decrementAndGet();
                lda.m16133s(iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    synchronized (kx9Var) {
                        kx9.f48559i = true;
                        kx9Var.f48563d.mo9916c();
                    }
                    kx9Var.f48562c.set(false);
                }
                qfd.f57735a.clear();
                jid.f45597a.clear();
                wr9Var.m24138b(null);
                return;
            case 22:
                C1043b c1043b4 = (C1043b) this.f41408b;
                c1043b4.mo12359D();
                if (Build.VERSION.SDK_INT < 30) {
                    return;
                }
                List<zzoh> list2 = (List) this.f41409c;
                qfc qfcVar4 = ((kjc) c1043b4.f60774a).f47437e;
                kjc.m15278j(qfcVar4);
                SparseArray sparseArrayM19932J = qfcVar4.m19932J();
                for (zzoh zzohVar : list2) {
                    int i33 = zzohVar.f12396c;
                    if (!sparseArrayM19932J.contains(i33) || ((Long) sparseArrayM19932J.get(i33)).longValue() < zzohVar.f12395b) {
                        c1043b4.m5871b0().add(zzohVar);
                    }
                }
                c1043b4.m5872c0();
                return;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                v4d v4dVar = (v4d) this.f41409c;
                q9c q9cVar = v4dVar.f64866d;
                kjc kjcVar6 = (kjc) v4dVar.f60774a;
                if (q9cVar == null) {
                    xcc xccVar7 = kjcVar6.f47438f;
                    kjc.m15280l(xccVar7);
                    xccVar7.f68080f.m17923a("Failed to send measurementEnabled to service");
                    return;
                }
                try {
                    q9cVar.mo11300o((zzr) this.f41408b);
                    v4dVar.m23116Q();
                    return;
                } catch (RemoteException e7) {
                    xcc xccVar8 = kjcVar6.f47438f;
                    kjc.m15280l(xccVar8);
                    xccVar8.f68080f.m17924b(e7, "Failed to send measurementEnabled to the service");
                    return;
                }
            case 24:
                ((e4d) this.f41409c).f36710c.m23114O((ComponentName) this.f41408b);
                return;
            case 25:
                b9d b9dVar2 = (b9d) this.f41408b;
                int i34 = ((ged) this.f41409c).f40688a;
                synchronized (b9dVar2) {
                    ged gedVar = (ged) b9dVar2.f8198e.get(i34);
                    if (gedVar != null) {
                        Log.w("MessengerIpcClient", "Timing out request: " + i34);
                        b9dVar2.f8198e.remove(i34);
                        gedVar.m12565b(new zzt("Timed out waiting for response", null));
                        b9dVar2.m3495c();
                    }
                    break;
                }
                return;
            case 26:
                v4d v4dVar2 = ((e4d) this.f41409c).f36710c;
                v4dVar2.f64866d = null;
                if (((ConnectionResult) this.f41408b).f11637b != 7777) {
                    v4dVar2.m23118S();
                    return;
                }
                if (v4dVar2.f64869g == null) {
                    v4dVar2.f64869g = Executors.newScheduledThreadPool(1);
                }
                v4dVar2.f64869g.schedule(new s3d(this, i3), ((Long) z8c.f71151Z.m21901a(null)).longValue(), TimeUnit.MILLISECONDS);
                return;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                try {
                    ((cvb) this.f41409c).mo9913b();
                    return;
                } catch (RemoteException e8) {
                    kjc kjcVar7 = ((AppMeasurementDynamiteService) this.f41408b).f12312f;
                    lda.m16130p(kjcVar7);
                    xcc xccVar9 = kjcVar7.f47438f;
                    kjc.m15280l(xccVar9);
                    xccVar9.f68083i.m17924b(e8, "Failed to call IDynamiteUploadBatchesCallback");
                    return;
                }
            case 28:
                m12919a();
                return;
            default:
                nc0 nc0Var = (nc0) this.f41408b;
                AtomicReference atomicReference = (AtomicReference) nc0Var.f52587e;
                lda.m16133s(((Thread) atomicReference.getAndSet(Thread.currentThread())) == null);
                try {
                    ((Runnable) this.f41409c).run();
                    atomicReference.set(null);
                    nc0Var.mo9916c();
                    return;
                } catch (Throwable th4) {
                    try {
                        atomicReference.set(null);
                        nc0Var.mo9916c();
                        throw th4;
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                        throw th4;
                    }
                }
        }
    }

    public String toString() {
        switch (this.f41407a) {
            case 0:
                mq7 mq7Var = new mq7(gvb.class.getSimpleName());
                gld gldVar = (gld) this.f41409c;
                cdb cdbVar = new cdb(8, false);
                ((cdb) mq7Var.f51735d).f9946c = cdbVar;
                mq7Var.f51735d = cdbVar;
                cdbVar.f9945b = gldVar;
                return mq7Var.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ gvb(Object obj, Object obj2, boolean z, int i) {
        this.f41407a = i;
        this.f41409c = obj;
        this.f41408b = obj2;
    }

    public gvb(ServiceConnectionC3351mx serviceConnectionC3351mx, oqb oqbVar, ServiceConnectionC3351mx serviceConnectionC3351mx2) {
        this.f41407a = 16;
        this.f41408b = oqbVar;
        this.f41409c = serviceConnectionC3351mx;
    }

    public /* synthetic */ gvb(int i, Object obj, Object obj2) {
        this.f41407a = i;
        this.f41408b = obj;
        this.f41409c = obj2;
    }

    public gvb(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.f41407a = 9;
        this.f41409c = swipeDismissBehavior;
        this.f41408b = view;
    }
}
