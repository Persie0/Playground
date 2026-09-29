package p000;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.compose.foundation.gestures.snapping.AbstractC0113b;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.measurement.internal.C1043b;
import com.google.android.gms.measurement.internal.zzji;
import com.google.android.gms.tasks.Task;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class nr9 implements InterfaceC0786au, tr6, InterfaceC0008a6, InterfaceC3117in, yoa, c90, a58, vib, oad {

    /* JADX INFO: renamed from: a */
    public Object f53173a;

    public nr9(d65 d65Var) {
        d65Var.getClass();
        this.f53173a = d65Var;
    }

    /* JADX INFO: renamed from: k */
    public static nr9 m17606k(String str) {
        return new nr9((TextUtils.isEmpty(str) || str.length() > 1) ? zzji.UNINITIALIZED : npc.m17585e(str.charAt(0)));
    }

    @Override // p000.vib
    /* JADX INFO: renamed from: a */
    public boolean mo12438a(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((vib[]) this.f53173a)[i].mo12438a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.a58
    public /* synthetic */ void accept(Object obj, Object obj2) {
        ((tdb) ((beb) obj).m11611l()).m21965Q((TelemetryData) this.f53173a);
        ((wr9) obj2).m24138b(null);
    }

    @Override // p000.yoa, p000.voa
    /* JADX INFO: renamed from: b */
    public boolean mo17607b() {
        ((ny8) this.f53173a).getClass();
        return false;
    }

    @Override // p000.vib
    /* JADX INFO: renamed from: c */
    public ejb mo12440c(Class cls) {
        for (int i = 0; i < 2; i++) {
            vib vibVar = ((vib[]) this.f53173a)[i];
            if (vibVar.mo12438a(cls)) {
                return vibVar.mo12440c(cls);
            }
        }
        C3386nv.m17636w("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // p000.voa
    /* JADX INFO: renamed from: d */
    public long mo9842d(AbstractC3081hn abstractC3081hn, AbstractC3081hn abstractC3081hn2, AbstractC3081hn abstractC3081hn3) {
        return ((ny8) this.f53173a).mo9842d(abstractC3081hn, abstractC3081hn2, abstractC3081hn3);
    }

    @Override // p000.InterfaceC0786au
    /* JADX INFO: renamed from: e */
    public Object mo3040e(wn8 wn8Var, Float f, Float f2, vi3 vi3Var, Continuation continuation) {
        float fFloatValue = f.floatValue();
        float fFloatValue2 = f2.floatValue();
        Object objM925b = AbstractC0113b.m925b(wn8Var, Math.signum(fFloatValue2) * Math.abs(fFloatValue), fFloatValue, r46.m20376a(0.0f, fFloatValue2, 28), (InterfaceC0025an) this.f53173a, vi3Var, (ContinuationImpl) continuation);
        return objM925b == CoroutineSingletons.COROUTINE_SUSPENDED ? objM925b : (C3764xm) objM925b;
    }

    @Override // p000.tr6
    /* JADX INFO: renamed from: f */
    public void mo4558f(Task task) {
        sm0 sm0Var = (sm0) this.f53173a;
        Exception excMo5966h = task.mo5966h();
        if (excMo5966h != null) {
            sm0Var.resumeWith(new Result.Failure(excMo5966h));
        } else if (task.mo5969k()) {
            sm0Var.mo10141l(null);
        } else {
            sm0Var.resumeWith(task.mo5967i());
        }
    }

    @Override // p000.oad
    /* JADX INFO: renamed from: g */
    public void mo12444g(String str, String str2, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        C1043b c1043b = (C1043b) this.f53173a;
        if (zIsEmpty) {
            c1043b.m5851H("auto", "_err", bundle);
        } else {
            c1043b.getClass();
            C3386nv.m17633t("Unexpected call on client side");
        }
    }

    @Override // p000.InterfaceC3117in
    public b73 get(int i) {
        return (m73) this.f53173a;
    }

    @Override // p000.c90
    /* JADX INFO: renamed from: h */
    public void mo4404h() {
        ((qo3) this.f53173a).onConnected(null);
    }

    @Override // p000.voa
    /* JADX INFO: renamed from: i */
    public AbstractC3081hn mo4033i(long j, AbstractC3081hn abstractC3081hn, AbstractC3081hn abstractC3081hn2, AbstractC3081hn abstractC3081hn3) {
        return ((ny8) this.f53173a).mo4033i(j, abstractC3081hn, abstractC3081hn2, abstractC3081hn3);
    }

    /* JADX INFO: renamed from: j */
    public d6d m17608j(String str, boolean z) {
        return new d6d(str, (pl1) this.f53173a, z);
    }

    @Override // p000.c90
    public void onConnectionSuspended(int i) {
        ((qo3) this.f53173a).onConnectionSuspended(i);
    }

    @Override // p000.voa
    /* JADX INFO: renamed from: r */
    public AbstractC3081hn mo4036r(long j, AbstractC3081hn abstractC3081hn, AbstractC3081hn abstractC3081hn2, AbstractC3081hn abstractC3081hn3) {
        return ((ny8) this.f53173a).mo4036r(j, abstractC3081hn, abstractC3081hn2, abstractC3081hn3);
    }

    @Override // p000.voa
    /* JADX INFO: renamed from: s */
    public AbstractC3081hn mo17609s(AbstractC3081hn abstractC3081hn, AbstractC3081hn abstractC3081hn2, AbstractC3081hn abstractC3081hn3) {
        return ((ny8) this.f53173a).mo17609s(abstractC3081hn, abstractC3081hn2, abstractC3081hn3);
    }

    public /* synthetic */ nr9(Object obj) {
        this.f53173a = obj;
    }
}
