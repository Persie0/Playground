package p000;

import android.util.Log;
import android.view.View;
import com.google.android.gms.internal.measurement.zzaeg;
import com.google.android.gms.internal.play_billing.zzgc;
import com.google.android.gms.tasks.Task;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.feature.review.ReviewSessionCompleteFragment;
import com.lingq.p020ui.AbstractC2891g;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fg2 implements sg5, bm1, gr6, kk1, lq5, zt5, o9a, tr6, h90, zv9, ew9 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39033a;

    public /* synthetic */ fg2(ed1 ed1Var) {
        this.f39033a = 16;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m11817c() throws zzaeg {
        throw new zzaeg();
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m11818g(int i, int i2) {
        throw new IndexOutOfBoundsException("position=" + i + ((Object) ", limit=") + i2);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m11819h(int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder(i);
        sb.append((Object) "Ran off end of other: 0, ");
        sb.append(i2);
        sb.append((Object) ", ");
        sb.append(i3);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m11820i(int i, long j) {
        throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char) i) + ((Object) " at index ") + j);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m11821j(Object obj, int i, int i2, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(i);
        sb.append((Object) " parameters found ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m11822k(String str) throws zzgc {
        throw new zzgc(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m11823l(int i, int i2) {
        throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char) i) + ((Object) " at index ") + i2);
    }

    @Override // p000.h90
    /* JADX INFO: renamed from: a */
    public void mo10699a(Object obj) {
        bh4[] bh4VarArr = ReviewSessionCompleteFragment.f31753G0;
        ((LessonCard) obj).getClass();
    }

    @Override // p000.kk1
    public void accept(Object obj) {
        switch (this.f39033a) {
            case 7:
                ((ExecutorService) obj).shutdown();
                break;
            default:
                ((xk8) obj).f68319b.getClass();
                break;
        }
    }

    @Override // p000.o9a
    public Object apply(Object obj) {
        switch (this.f39033a) {
            case 10:
                xx5 xx5Var = (xx5) obj;
                xx5Var.getClass();
                sq5 sq5Var = zn7.f71798a;
                sq5Var.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    sq5Var.m21564e(xx5Var, byteArrayOutputStream);
                    break;
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
            default:
                List list = (List) obj;
                if (list == null) {
                    return null;
                }
                List list2 = list;
                ArrayList arrayList = new ArrayList(v91.m23189q0(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((o8b) it.next()).m17856a());
                }
                return arrayList;
        }
    }

    @Override // p000.zv9
    /* JADX INFO: renamed from: b */
    public boolean mo11824b(e28 e28Var, e28 e28Var2) {
        switch (this.f39033a) {
            case 17:
                return e28Var.m10808i(e28Var2);
            default:
                return e28Var2.m10800a(e28Var.m10803d());
        }
    }

    @Override // p000.zt5
    /* JADX INFO: renamed from: d */
    public int mo11825d(Object obj) {
        String str = ((vt5) obj).f65881a;
        return (str.startsWith("OMX.google") || str.startsWith("c2.android")) ? 1 : 0;
    }

    @Override // p000.bm1
    /* JADX INFO: renamed from: e */
    public Object mo393e(Task task) {
        int i;
        boolean z;
        switch (this.f39033a) {
            case 2:
                i = 403;
                break;
            case 3:
                i = -1;
                break;
            default:
                if (task.mo5971m()) {
                    y20 y20Var = (y20) task.mo5967i();
                    iy5 iy5Var = iy5.f44770f;
                    iy5Var.m14205e("Crashlytics report successfully enqueued to DataTransport: " + y20Var.f69116b);
                    File file = y20Var.f69117c;
                    z = true;
                    if (file.delete()) {
                        iy5Var.m14205e("Deleted report file: " + file.getPath());
                    } else {
                        iy5Var.m14208s("Crashlytics could not delete report file: " + file.getPath(), null);
                    }
                } else {
                    Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.mo5966h());
                    z = false;
                }
                return Boolean.valueOf(z);
        }
        return Integer.valueOf(i);
    }

    @Override // p000.tr6
    /* JADX INFO: renamed from: f */
    public void mo4558f(Task task) {
        task.getClass();
        AbstractC2891g.m9818b("launchReviewFlow COMPLETE (isSuccessful=" + task.mo5971m() + ")", null);
    }

    @Override // p000.sg5
    public void invoke(Object obj) {
        ((ba7) obj).getClass();
    }

    @Override // p000.gr6
    /* JADX INFO: renamed from: s */
    public f6b mo1889s(View view, f6b f6bVar) {
        switch (this.f39033a) {
            case 6:
                l64 l64VarMo136i = f6bVar.f38536a.mo136i(519);
                view.setPadding(0, l64VarMo136i.f49117b, 0, l64VarMo136i.f49119d);
                return f6bVar;
            case 11:
                view.getClass();
                l64 l64VarMo136i2 = f6bVar.f38536a.mo136i(519);
                l64VarMo136i2.getClass();
                view.setPadding(view.getPaddingLeft(), l64VarMo136i2.f49117b, view.getPaddingRight(), view.getPaddingBottom());
                return f6b.f38535b;
            default:
                view.getClass();
                l64 l64VarMo136i3 = f6bVar.f38536a.mo136i(519);
                l64VarMo136i3.getClass();
                view.setPadding(view.getPaddingLeft(), l64VarMo136i3.f49117b, view.getPaddingRight(), view.getPaddingBottom());
                return f6b.f38535b;
        }
    }

    public /* synthetic */ fg2(int i) {
        this.f39033a = i;
    }
}
