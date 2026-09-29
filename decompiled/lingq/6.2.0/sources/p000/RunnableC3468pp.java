package p000;

import android.animation.ValueAnimator;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Rect;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.constraintlayout.motion.widget.AbstractC0475b;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.lifecycle.Lifecycle$State;
import androidx.media3.exoplayer.source.C0717b;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.play_billing.zzjd;
import com.google.android.gms.measurement.internal.C1045d;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.installations.C1154a;
import com.iterable.iterableapi.C1210f;
import com.lingq.core.p012ui.UpgradeReason;
import com.lingq.feature.reader.old.vocabulary.LessonVocabularyFragment;
import java.io.IOException;
import java.util.Date;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: pp */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC3468pp implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f56617a;

    /* JADX INFO: renamed from: b */
    public final Object f56618b;

    public RunnableC3468pp(ocb ocbVar, ztb ztbVar) {
        this.f56617a = 22;
        Objects.requireNonNull(ocbVar);
        this.f56618b = ztbVar;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x023b  */
    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        boolean zM4650a;
        int iM12742e;
        int height;
        int i = 1;
        int iM12742e2 = 0;
        switch (this.f56617a) {
            case 0:
                LayoutInflaterFactory2C3804yp layoutInflaterFactory2C3804yp = (LayoutInflaterFactory2C3804yp) this.f56618b;
                layoutInflaterFactory2C3804yp.f70194Q.showAtLocation(layoutInflaterFactory2C3804yp.f70193P, 55, 0, 0);
                xua xuaVar = layoutInflaterFactory2C3804yp.f70196S;
                if (xuaVar != null) {
                    xuaVar.m24704b();
                }
                if (!layoutInflaterFactory2C3804yp.f70197T || (viewGroup = layoutInflaterFactory2C3804yp.f70198U) == null || !viewGroup.isLaidOut()) {
                    layoutInflaterFactory2C3804yp.f70193P.setAlpha(1.0f);
                    layoutInflaterFactory2C3804yp.f70193P.setVisibility(0);
                    return;
                }
                layoutInflaterFactory2C3804yp.f70193P.setAlpha(0.0f);
                xua xuaVarM10630a = dta.m10630a(layoutInflaterFactory2C3804yp.f70193P);
                xuaVarM10630a.m24703a(1.0f);
                layoutInflaterFactory2C3804yp.f70196S = xuaVarM10630a;
                xuaVarM10630a.m24706d(new C3421op(this, iM12742e2));
                return;
            case 1:
                ig5 ig5Var = (ig5) this.f56618b;
                nm2 nm2Var = ig5Var.f44079c;
                f20 f20Var = ig5Var.f44077a;
                if (ig5Var.f44074J) {
                    if (ig5Var.f44072H) {
                        ig5Var.f44072H = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        f20Var.f38292e = jCurrentAnimationTimeMillis;
                        f20Var.f38294g = -1L;
                        f20Var.f38293f = jCurrentAnimationTimeMillis;
                        f20Var.f38295h = 0.5f;
                    }
                    if ((f20Var.f38294g > 0 && AnimationUtils.currentAnimationTimeMillis() > f20Var.f38294g + ((long) f20Var.f38296i)) || !ig5Var.m13899e()) {
                        ig5Var.f44074J = false;
                        return;
                    }
                    if (ig5Var.f44073I) {
                        ig5Var.f44073I = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        nm2Var.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (f20Var.f38293f == 0) {
                        ho2.m13385e("Cannot compute scroll delta before calling start()");
                        return;
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fM11504a = f20Var.m11504a(jCurrentAnimationTimeMillis2);
                    long j = jCurrentAnimationTimeMillis2 - f20Var.f38293f;
                    f20Var.f38293f = jCurrentAnimationTimeMillis2;
                    ig5Var.f44076L.scrollListBy((int) (j * ((fM11504a * 4.0f) + ((-4.0f) * fM11504a * fM11504a)) * f20Var.f38291d));
                    WeakHashMap weakHashMap = dta.f36217a;
                    nm2Var.postOnAnimation(this);
                    return;
                }
                return;
            case 2:
                kg0 kg0Var = (kg0) this.f56618b;
                kg0Var.f47156c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) kg0Var.f47158e;
                ita itaVar = bottomSheetBehavior.f12699P;
                if (itaVar != null && itaVar.m14133f()) {
                    kg0Var.m15171a(kg0Var.f47155b);
                    return;
                } else {
                    if (bottomSheetBehavior.f12698O == 2) {
                        bottomSheetBehavior.m6033N(kg0Var.f47155b);
                        return;
                    }
                    return;
                }
            case 3:
                ch1 ch1Var = (ch1) this.f56618b;
                synchronized (ch1Var) {
                    zM4650a = ch1Var.m4650a();
                    if (zM4650a) {
                        synchronized (ch1Var) {
                            ch1Var.f10065b = true;
                        }
                    }
                }
                if (zM4650a) {
                    C3126ix c3126ixM11148c = ch1Var.f10080q.m11148c();
                    ch1Var.f10079p.getClass();
                    if (new Date(System.currentTimeMillis()).before((Date) c3126ixM11148c.f44721c)) {
                        ch1Var.m4655h();
                        return;
                    }
                    C1154a c1154a = (C1154a) ch1Var.f10074k;
                    tld tldVarM6698d = c1154a.m6698d();
                    tld tldVarM6697c = c1154a.m6697c();
                    Task taskMo5965g = Tasks.m5977e(tldVarM6698d, tldVarM6697c).mo5965g(ch1Var.f10071h, new ah1(ch1Var, tldVarM6698d, tldVarM6697c));
                    Tasks.m5977e(taskMo5965g).mo5964f(ch1Var.f10071h, new vg1(i, ch1Var, taskMo5965g));
                    return;
                }
                return;
            case 4:
                be2 be2Var = (be2) this.f56618b;
                be2Var.f8425z0.onDismiss(be2Var.f8417H0);
                return;
            case 5:
                nm2 nm2Var2 = (nm2) this.f56618b;
                nm2Var2.f52954l = null;
                nm2Var2.drawableStateChanged();
                return;
            case 6:
                uz2 uz2Var = (uz2) this.f56618b;
                ValueAnimator valueAnimator = uz2Var.f64589z;
                int i2 = uz2Var.f64562A;
                if (i2 == 1) {
                    valueAnimator.cancel();
                } else if (i2 != 2) {
                    return;
                }
                uz2Var.f64562A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500L);
                valueAnimator.start();
                return;
            case 7:
                hy7 hy7Var = (hy7) this.f56618b;
                hy7Var.f43213k = false;
                hy7Var.m13587m();
                return;
            case 8:
                za4 za4Var = (za4) this.f56618b;
                if (za4Var.f71263c != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j2 = za4Var.f71260A;
                    long j3 = j2 != Long.MIN_VALUE ? jCurrentTimeMillis - j2 : 0L;
                    y28 layoutManager = za4Var.f71277q.getLayoutManager();
                    if (za4Var.f71286z == null) {
                        za4Var.f71286z = new Rect();
                    }
                    View view = za4Var.f71263c.f53781a;
                    Rect rect = za4Var.f71286z;
                    RecyclerView recyclerView = layoutManager.f69172b;
                    if (recyclerView == null) {
                        rect.set(0, 0, 0, 0);
                    } else {
                        rect.set(recyclerView.m2720O(view));
                    }
                    if (layoutManager.mo2679d()) {
                        int i3 = (int) (za4Var.f71270j + za4Var.f71268h);
                        int paddingLeft = (i3 - za4Var.f71286z.left) - za4Var.f71277q.getPaddingLeft();
                        float f = za4Var.f71268h;
                        if ((f >= 0.0f || paddingLeft >= 0) && (f <= 0.0f || (paddingLeft = ((za4Var.f71263c.f53781a.getWidth() + i3) + za4Var.f71286z.right) - (za4Var.f71277q.getWidth() - za4Var.f71277q.getPaddingRight())) <= 0)) {
                            iM12742e = 0;
                        } else {
                            iM12742e = paddingLeft;
                        }
                    } else {
                        iM12742e = 0;
                    }
                    if (layoutManager.mo2680e()) {
                        int i4 = (int) (za4Var.f71271k + za4Var.f71269i);
                        int paddingTop = (i4 - za4Var.f71286z.top) - za4Var.f71277q.getPaddingTop();
                        float f2 = za4Var.f71269i;
                        if (f2 < 0.0f && paddingTop < 0) {
                            iM12742e2 = paddingTop;
                        } else if (f2 > 0.0f && (height = ((za4Var.f71263c.f53781a.getHeight() + i4) + za4Var.f71286z.bottom) - (za4Var.f71277q.getHeight() - za4Var.f71277q.getPaddingBottom())) > 0) {
                            iM12742e2 = height;
                        }
                    }
                    if (iM12742e != 0) {
                        gld gldVar = za4Var.f71273m;
                        RecyclerView recyclerView2 = za4Var.f71277q;
                        int width = za4Var.f71263c.f53781a.getWidth();
                        za4Var.f71277q.getWidth();
                        iM12742e = gldVar.m12742e(recyclerView2, width, iM12742e, j3);
                    }
                    int i5 = iM12742e;
                    if (iM12742e2 != 0) {
                        gld gldVar2 = za4Var.f71273m;
                        RecyclerView recyclerView3 = za4Var.f71277q;
                        int height2 = za4Var.f71263c.f53781a.getHeight();
                        za4Var.f71277q.getHeight();
                        iM12742e2 = gldVar2.m12742e(recyclerView3, height2, iM12742e2, j3);
                    }
                    if (i5 == 0 && iM12742e2 == 0) {
                        za4Var.f71260A = Long.MIN_VALUE;
                        return;
                    }
                    if (za4Var.f71260A == Long.MIN_VALUE) {
                        za4Var.f71260A = jCurrentTimeMillis;
                    }
                    za4Var.f71277q.scrollBy(i5, iM12742e2);
                    o38 o38Var = za4Var.f71263c;
                    if (o38Var != null) {
                        za4Var.m25525o(o38Var);
                    }
                    za4Var.f71277q.removeCallbacks(za4Var.f71278r);
                    RecyclerView recyclerView4 = za4Var.f71277q;
                    WeakHashMap weakHashMap2 = dta.f36217a;
                    recyclerView4.postOnAnimation(this);
                    return;
                }
                return;
            case 9:
                eh0.m11133m("IterableInAppFragmentHTMLNotification", "Orientation changed, triggering resize");
                ((zb4) this.f56618b).f71301b.m6910s0();
                return;
            case 10:
                ((C1210f) this.f56618b).m6914f();
                return;
            case 11:
                LessonVocabularyFragment lessonVocabularyFragment = (LessonVocabularyFragment) this.f56618b;
                if (lessonVocabularyFragment.f5709m0.f66586d == Lifecycle$State.RESUMED) {
                    bia biaVar = lessonVocabularyFragment.f29680F0;
                    if (biaVar != null) {
                        biaVar.mo3737M1(UpgradeReason.LIMIT_WORDS);
                        return;
                    } else {
                        fa4.m11636J("upgradePopupDelegate");
                        throw null;
                    }
                }
                return;
            case 12:
                C0717b c0717b = (C0717b) this.f56618b;
                yk8[] yk8VarArr = c0717b.f6474O;
                int length = yk8VarArr.length;
                while (iM12742e2 < length) {
                    yk8 yk8Var = yk8VarArr[iM12742e2];
                    yk8Var.m25178q(true);
                    web webVar = yk8Var.f69947h;
                    if (webVar != null) {
                        webVar.m23874L(yk8Var.f69944e);
                        yk8Var.f69947h = null;
                        yk8Var.f69946g = null;
                    }
                    iM12742e2++;
                }
                gv5 gv5Var = c0717b.f6508l;
                hy2 hy2Var = (hy2) gv5Var.f41393c;
                if (hy2Var != null) {
                    hy2Var.mo109a();
                    gv5Var.f41393c = null;
                }
                gv5Var.f41394d = null;
                return;
            case 13:
                ((ViewGroup) this.f56618b).setNestedScrollingEnabled(true);
                return;
            case 14:
                ((AbstractC0475b) this.f56618b).f5375I0.m1934a();
                return;
            case 15:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.f56618b;
                if (searchView$SearchAutoComplete.f1150f) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f1150f = false;
                    return;
                }
                return;
            case 16:
                ((StaggeredGridLayoutManager) this.f56618b).m2767J0();
                return;
            case 17:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.f56618b).f13282c.f44498g;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 18:
                ((ita) this.f56618b).m14140m(0);
                return;
            case 19:
                ((scb) this.f56618b).m21226a();
                return;
            case 20:
                scb scbVar = (scb) ((web) this.f56618b).f66742a;
                scbVar.f60689g.m11609d(scbVar.f60689g.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 21:
                ((edb) this.f56618b).f37094m.m22675b(new ConnectionResult(4, null, null));
                return;
            case 22:
                throw null;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                b2b b2bVar = (b2b) this.f56618b;
                synchronized (b2bVar.f7812a) {
                    try {
                        if (b2bVar.m3198b()) {
                            Log.e("WakeLock", String.valueOf(b2bVar.f7821j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                            b2bVar.m3200d();
                            if (b2bVar.m3198b()) {
                                b2bVar.f7814c = 1;
                                b2bVar.m3201e();
                                return;
                            }
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 24:
                if (((wr9) this.f56618b).m24139c(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 25:
                nnb nnbVar = (nnb) this.f56618b;
                try {
                    SQLiteDatabase sQLiteDatabaseM17559u0 = nnbVar.m17559u0();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("elapsed_time", (Long) 0L);
                    sQLiteDatabaseM17559u0.update("raw_events", contentValues, null, null);
                    return;
                } catch (SQLiteException e) {
                    xcc xccVar = ((kjc) nnbVar.f60774a).f47438f;
                    kjc.m15280l(xccVar);
                    xccVar.f68080f.m17924b(e, "Failed to remove elapsed times from raw events table");
                    return;
                }
            case 26:
                frb frbVar = (frb) this.f56618b;
                kc0 kc0Var = frbVar.f39538d;
                kc0Var.m15101s(0);
                zzjd zzjdVar = zzjd.EXECUTE_ASYNC_TIMEOUT;
                qc0 qc0Var = wwb.f67446k;
                kc0Var.m15100r(qc0Var, zzjdVar);
                frbVar.m12033c(qc0Var);
                return;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                aec aecVar = (aec) this.f56618b;
                synchronized (aecVar.f563c) {
                    try {
                        sr6 sr6Var = (sr6) aecVar.f564d;
                        if (sr6Var != null) {
                            sr6Var.mo319b();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            case 28:
                ((C1045d) ((qfb) this.f56618b).f57710d).m5897N();
                return;
            default:
                j0d j0dVar = (j0d) this.f56618b;
                j0dVar.f44863e = j0dVar.f44868j;
                return;
        }
    }

    public /* synthetic */ RunnableC3468pp(Object obj, int i) {
        this.f56617a = i;
        this.f56618b = obj;
    }

    public RunnableC3468pp(edb edbVar) {
        this.f56617a = 21;
        Objects.requireNonNull(edbVar);
        this.f56618b = edbVar;
    }

    public RunnableC3468pp(qfb qfbVar, boolean z) {
        this.f56617a = 28;
        this.f56618b = qfbVar;
    }

    public RunnableC3468pp(j0d j0dVar) {
        this.f56617a = 29;
        Objects.requireNonNull(j0dVar);
        this.f56618b = j0dVar;
    }
}
