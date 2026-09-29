package p000;

import android.net.Uri;
import com.google.android.gms.internal.measurement.zzsk;
import com.google.common.util.concurrent.AbstractC1118h;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nkd implements InterfaceC3053gw {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52899a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rkd f52900b;

    public /* synthetic */ nkd(rkd rkdVar, int i) {
        this.f52899a = i;
        this.f52900b = rkdVar;
    }

    @Override // p000.InterfaceC3053gw
    public final ListenableFuture apply(Object obj) throws IOException {
        ListenableFuture listenableFuture;
        int i = this.f52899a;
        rkd rkdVar = this.f52900b;
        switch (i) {
            case 0:
                synchronized (rkdVar.f59459h) {
                    listenableFuture = rkdVar.f59461j;
                    break;
                }
                return listenableFuture;
            case 1:
                return AbstractC1118h.m6399c(rkdVar.m20685b((Uri) AbstractC1118h.m6398b(rkdVar.f59453b)));
            case 2:
                rkdVar.m20686c((Uri) AbstractC1118h.m6398b(rkdVar.f59453b), obj);
                return y04.f69048b;
            default:
                Uri uri = (Uri) obj;
                Uri uriBuild = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(".bak")).build();
                try {
                    dgd dgdVar = rkdVar.f59456e;
                    ny8 ny8VarM10372b = dgdVar.m10372b(uriBuild);
                    if (((uid) ny8VarM10372b.f53414b).mo14448b((Uri) ny8VarM10372b.f53417e)) {
                        ny8 ny8VarM10372b2 = dgdVar.m10372b(uriBuild);
                        ny8 ny8VarM10372b3 = dgdVar.m10372b(uri);
                        uid uidVar = (uid) ny8VarM10372b2.f53414b;
                        if (uidVar != ((uid) ny8VarM10372b3.f53414b)) {
                            throw new zzsk("Cannot rename file across backends");
                        }
                        uidVar.mo14453g((Uri) ny8VarM10372b2.f53417e, (Uri) ny8VarM10372b3.f53417e);
                    }
                    return y04.f69048b;
                } catch (IOException e) {
                    return new x04(e);
                }
        }
    }
}
