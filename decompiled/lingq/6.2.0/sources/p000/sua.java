package p000;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.viewpager2.widget.ViewPager2;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.internal.measurement.zzaeh;
import com.google.android.gms.internal.measurement.zzsg;
import com.google.android.gms.internal.play_billing.AbstractC0985a;
import com.google.android.gms.tasks.Task;
import com.google.common.base.Optional;
import com.google.common.util.concurrent.AbstractC1118h;
import com.google.common.util.concurrent.AbstractC1120j;
import com.google.common.util.concurrent.ExecutorC1122l;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes2.dex */
public final class sua implements InterfaceC3396o4, a58, InterfaceC2991f7, tr6, InterfaceC3016fw {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61448a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f61449b;

    public /* synthetic */ sua(Object obj, int i) {
        this.f61448a = i;
        this.f61449b = obj;
    }

    @Override // p000.a58
    public void accept(Object obj, Object obj2) {
        int i = this.f61448a;
        Object obj3 = this.f61449b;
        wr9 wr9Var = (wr9) obj2;
        switch (i) {
            case 1:
                geb gebVar = (geb) obj3;
                feb febVar = new feb(gebVar, wr9Var);
                zeb zebVar = (zeb) ((heb) obj).m11611l();
                ApiMetadata apiMetadata = new ApiMetadata(new ComplianceOptions(-1, -1, 0, true), false);
                apiMetadata.f11649c = false;
                String str = gebVar.f40641l;
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(zebVar.f51090h);
                int i2 = meb.f51223a;
                parcelObtain.writeStrongBinder(febVar);
                parcelObtain.writeString(str);
                meb.m16798b(parcelObtain, apiMetadata);
                zebVar.m16770G(parcelObtain, 2);
                break;
            default:
                int i3 = ltc.f50124l;
                lrc lrcVar = new lrc(wr9Var);
                suc sucVar = (suc) ((yuc) obj).m11611l();
                byte[] bArrM3725a = ((x0d) obj3).m3725a();
                Parcel parcelM16773J = sucVar.m16773J();
                bqb.m4107d(parcelM16773J, lrcVar);
                parcelM16773J.writeByteArray(bArrM3725a);
                sucVar.m16776M(parcelM16773J, 31);
                break;
        }
    }

    @Override // p000.InterfaceC3396o4
    /* JADX INFO: renamed from: b */
    public boolean mo4797b(View view) {
        C3329mb c3329mb = (C3329mb) this.f61449b;
        int currentItem = ((ViewPager2) view).getCurrentItem() - 1;
        ViewPager2 viewPager2 = (ViewPager2) c3329mb.f50863e;
        if (viewPager2.f7115M) {
            viewPager2.m2893d(currentItem, true);
        }
        return true;
    }

    @Override // p000.InterfaceC2991f7
    /* JADX INFO: renamed from: c */
    public void mo2125c(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f61449b;
        ActivityResult activityResult = (ActivityResult) obj;
        Intent intent = activityResult.f1008b;
        int i = AbstractC0985a.m5504e(intent, "ProxyBillingActivityV2").f57553a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.f11290U;
        if (resultReceiver != null) {
            resultReceiver.send(i, intent == null ? null : intent.getExtras());
        }
        int i2 = activityResult.f1007a;
        if (i2 != -1 || i != 0) {
            AbstractC0985a.m5508i("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i2 + " and billing's responseCode: " + i);
        }
        proxyBillingActivityV2.finish();
    }

    @Override // p000.InterfaceC3016fw
    public ListenableFuture call() {
        ListenableFuture listenableFutureM6397a;
        rkd rkdVar = (rkd) this.f61449b;
        ExecutorC1122l executorC1122l = rkdVar.f59455d;
        try {
            return AbstractC1118h.m6399c(rkdVar.m20685b((Uri) AbstractC1118h.m6398b(rkdVar.f59453b)));
        } catch (IOException e) {
            Optional optional = rkdVar.f59457f;
            optional.getClass();
            if ((e instanceof zzsg) || (e.getCause() instanceof zzsg)) {
                return new x04(e);
            }
            hld hldVar = (hld) optional.mo6258b();
            hldVar.getClass();
            int i = 3;
            if (e.getCause() instanceof zzaeh) {
                y04 y04VarM6399c = AbstractC1118h.m6399c(hldVar.f42593a);
                nkd nkdVar = new nkd(rkdVar, 2);
                int i2 = jmd.f45851a;
                listenableFutureM6397a = AbstractC1118h.m6397a(AbstractC1118h.m6403g(y04VarM6399c, new ubd(i, qld.m20020a(), nkdVar), executorC1122l), IOException.class, new i8d(e, 4), AbstractC1120j.m6404a());
            } else {
                listenableFutureM6397a = new x04(e);
            }
            nkd nkdVar2 = new nkd(rkdVar, 1);
            int i3 = jmd.f45851a;
            return AbstractC1118h.m6403g(listenableFutureM6397a, new ubd(i, qld.m20020a(), nkdVar2), executorC1122l);
        }
    }

    @Override // p000.tr6
    /* JADX INFO: renamed from: f */
    public void mo4558f(Task task) {
        ((CountDownLatch) this.f61449b).countDown();
    }
}
