package p000;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.camera.uiutils.ViewSmoothRotationUtil$Rotatee;
import com.google.android.gms.common.annotation.HJo.JrxsYuVZZqnFC;
import com.google.android.gms.common.api.Status;
import com.google.android.play.core.common.wMe.NptsKnlVczSZ;
import com.google.p020vr.vrcore.controller.api.DJK.rmwTRjObXLGH;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class jvh {
    /* JADX INFO: renamed from: A */
    public static Bitmap m13543A(Bitmap bitmap, int i) {
        if (i % 360 == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    /* JADX INFO: renamed from: B */
    public static Animator.AnimatorListener m13544B(Consumer consumer) {
        return new ikx(consumer);
    }

    /* JADX INFO: renamed from: C */
    public static Animator.AnimatorListener m13545C(Consumer consumer) {
        return new iky(consumer);
    }

    /* JADX INFO: renamed from: D */
    public static boolean m13546D(MotionEvent motionEvent) {
        return motionEvent.getActionMasked() == 0;
    }

    /* JADX INFO: renamed from: F */
    public static ihb m13548F(int i, Object... objArr) {
        return new ihf(i, objArr);
    }

    /* JADX INFO: renamed from: G */
    public static ihb m13549G(int i, int i2, Object... objArr) {
        return new ihe(i, i2, objArr);
    }

    /* JADX INFO: renamed from: H */
    public static boolean m13550H(ihb ihbVar) {
        return ihbVar == ihd.f30944a;
    }

    /* JADX INFO: renamed from: I */
    public static ihk m13551I(ifi ifiVar, List list) {
        ihk ihkVar = new ihk(ifiVar);
        list.add(ihkVar);
        return ihkVar;
    }

    /* JADX INFO: renamed from: J */
    private static Object m13552J(jpp jppVar) throws ExecutionException {
        if (jppVar.mo13452e()) {
            return jppVar.mo13450c();
        }
        if (((jpt) jppVar).f34565c) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(jppVar.mo13449b());
    }

    /* JADX INFO: renamed from: K */
    private static float m13553K(float f) {
        return f >= 180.0f ? 180.0f - f : f;
    }

    /* JADX INFO: renamed from: b */
    public static Executor m13554b() {
        return m13555c(new jvd());
    }

    /* JADX INFO: renamed from: c */
    public static Executor m13555c(jvd jvdVar) {
        return new kuy(jvdVar, 1);
    }

    /* JADX INFO: renamed from: d */
    public static Handler m13556d() {
        return new Handler();
    }

    /* JADX INFO: renamed from: e */
    public static Handler m13557e(Looper looper) {
        return new Handler(looper);
    }

    /* JADX INFO: renamed from: f */
    public static Handler m13558f(jvb jvbVar, String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        jvbVar.m13537d(new jva(handlerThread));
        return m13557e(handlerThread.getLooper());
    }

    /* JADX INFO: renamed from: g */
    public static nps m13559g(nps npsVar, nps npsVar2, kas kasVar) {
        jux juxVar = new jux(kasVar);
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(npsVar);
        arrayList.add(npsVar2);
        return nod.m17554j(kxk.m14961G(arrayList), new cnc(juxVar, 9), not.INSTANCE);
    }

    /* JADX INFO: renamed from: h */
    public static Object m13560h(nps npsVar) {
        Object obj;
        if (!npsVar.isDone() || npsVar.isCancelled()) {
            return null;
        }
        boolean z = false;
        while (true) {
            try {
                obj = npsVar.get();
                break;
            } catch (InterruptedException e) {
                z = true;
            } catch (ExecutionException e2) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                return null;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* JADX INFO: renamed from: i */
    public static void m13561i(nps npsVar, kao kaoVar) {
        m13562j(npsVar, kaoVar, not.INSTANCE);
    }

    /* JADX INFO: renamed from: j */
    public static void m13562j(nps npsVar, kao kaoVar, Executor executor) {
        kxk.m14975U(npsVar, new juv(kaoVar, 0), executor);
    }

    /* JADX INFO: renamed from: k */
    public static void m13563k(nps npsVar, nps npsVar2, juw juwVar, Executor executor) {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(npsVar);
        arrayList.add(npsVar2);
        nod.m17554j(kxk.m14961G(arrayList), new cnc(juwVar, 8), executor);
    }

    /* JADX INFO: renamed from: l */
    public static Status m13564l(int i) {
        String strM12980c;
        switch (i) {
            case 4000:
                strM12980c = rmwTRjObXLGH.RQGgwHh;
                break;
            case 4001:
                strM12980c = "DUPLICATE_LISTENER";
                break;
            case 4002:
                strM12980c = "UNKNOWN_LISTENER";
                break;
            case 4003:
                strM12980c = "DATA_ITEM_TOO_LARGE";
                break;
            case 4004:
                strM12980c = "INVALID_TARGET_NODE";
                break;
            case 4005:
                strM12980c = "ASSET_UNAVAILABLE";
                break;
            case 4006:
                strM12980c = "DUPLICATE_CAPABILITY";
                break;
            case 4007:
                strM12980c = "UNKNOWN_CAPABILITY";
                break;
            case 4008:
                strM12980c = JrxsYuVZZqnFC.yRmXVNtbSuaWd;
                break;
            case 4009:
                strM12980c = NptsKnlVczSZ.TbkFQFx;
                break;
            case 4010:
                strM12980c = "ACCOUNT_KEY_CREATION_FAILED";
                break;
            case 4011:
            default:
                strM12980c = jeu.m12980c(i);
                break;
            case 4012:
                strM12980c = "MIGRATION_NOT_CANCELLABLE";
                break;
            case 4013:
                strM12980c = "NO_MIGRATION_FOUND_TO_CANCEL";
                break;
            case 4014:
                strM12980c = "FEATURE_DISABLED";
                break;
        }
        return new Status(i, strM12980c);
    }

    /* JADX INFO: renamed from: m */
    public static jpp m13565m(Exception exc) {
        jpt jptVar = new jpt();
        jptVar.m13462n(exc);
        return jptVar;
    }

    /* JADX INFO: renamed from: n */
    public static jpp m13566n(Object obj) {
        jpt jptVar = new jpt();
        jptVar.m13463o(obj);
        return jptVar;
    }

    /* JADX INFO: renamed from: o */
    public static Object m13567o(jpp jppVar, long j, TimeUnit timeUnit) {
        if (jiy.m13277d()) {
            throw new IllegalStateException("Must not be called on the main application thread");
        }
        jib.m13206k(timeUnit, "TimeUnit must not be null");
        if (jppVar.mo13451d()) {
            return m13552J(jppVar);
        }
        jpu jpuVar = new jpu();
        jppVar.mo13458k(jps.f34562b, jpuVar);
        jppVar.mo13457j(jps.f34562b, jpuVar);
        jppVar.mo13453f(jps.f34562b, jpuVar);
        if (jpuVar.f34569a.await(j, timeUnit)) {
            return m13552J(jppVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    /* JADX INFO: renamed from: p */
    public static Point m13568p(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return new Point(iArr[0], iArr[1]);
    }

    /* JADX INFO: renamed from: q */
    public static Point m13569q(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new Point(iArr[0], iArr[1]);
    }

    /* JADX INFO: renamed from: r */
    public static Collection m13570r(ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            arrayList.add(viewGroup.getChildAt(i));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m13571s(PointF pointF, View view) {
        int[] iArrM11435f = ill.m11435f(view.getRootView());
        float f = pointF.x + iArrM11435f[0];
        float f2 = pointF.y + iArrM11435f[1];
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return f >= ((float) iArr[0]) && f <= ((float) (iArr[0] + view.getWidth())) && f2 >= ((float) iArr[1]) && f2 <= ((float) (iArr[1] + view.getHeight()));
    }

    /* JADX INFO: renamed from: t */
    public static void m13572t(View view) {
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: renamed from: u */
    public static int m13573u(ilk ilkVar) {
        if (ilk.m11427e(ilkVar)) {
            return 0;
        }
        return ilkVar.m11428c().f31449e;
    }

    /* JADX INFO: renamed from: v */
    public static mrm m13574v(View view, ilk ilkVar) {
        return m13575w(new ilm(view), ilkVar);
    }

    /* JADX INFO: renamed from: w */
    public static mrm m13575w(ViewSmoothRotationUtil$Rotatee viewSmoothRotationUtil$Rotatee, ilk ilkVar) {
        viewSmoothRotationUtil$Rotatee.getClass();
        float fM13573u = m13573u(ilkVar);
        float fAbs = Math.abs(m13553K(viewSmoothRotationUtil$Rotatee.mo4510a()) - m13553K(fM13573u));
        if (fAbs == 0.0f) {
            return mqu.f41450a;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewSmoothRotationUtil$Rotatee.mo4511b(), viewSmoothRotationUtil$Rotatee.mo4512c(), viewSmoothRotationUtil$Rotatee.mo4510a(), m13553K(fM13573u));
        objectAnimatorOfFloat.setInterpolator(new akf());
        objectAnimatorOfFloat.setDuration(fAbs <= 90.0f ? 250L : 0L);
        return mrm.m16829i(objectAnimatorOfFloat);
    }

    @Deprecated
    /* JADX INFO: renamed from: x */
    public static void m13576x(View view, ilk ilkVar) {
        if (ilkVar.equals(ilk.REVERSE_PORTRAIT)) {
            view.setRotation(0.0f);
        } else {
            view.setRotation(ilkVar.f31449e);
        }
        view.setPivotX(view.getHeight() / 2.0f);
        view.setPivotY(view.getHeight() / 2.0f);
        if (ilkVar.equals(ilk.LANDSCAPE)) {
            view.setTranslationY(view.getWidth() - view.getHeight());
        } else {
            view.setTranslationY(0.0f);
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m13577y(View view, ilk ilkVar) {
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        if (ilk.m11427e(ilkVar)) {
            view.setRotation(0.0f);
        } else {
            view.setRotation(ilkVar.f31449e);
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m13578z(View view, ilk ilkVar) {
        mrm mrmVarM13574v = m13574v(view, ilkVar);
        if (mrmVarM13574v.mo16813g()) {
            ((ValueAnimator) mrmVarM13574v.mo16809c()).start();
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean mo11402a(ihk ihkVar) {
        throw null;
    }
}
