package p000;

import android.content.Context;
import android.net.Uri;
import android.provider.MediaStore;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cot {

    /* JADX INFO: renamed from: a */
    public static final String[] f8497a = {"_id"};

    /* JADX INFO: renamed from: b */
    public final Context f8498b;

    /* JADX INFO: renamed from: c */
    public final cof f8499c;

    /* JADX INFO: renamed from: d */
    private final ExecutorService f8500d;

    public cot(Context context, ExecutorService executorService, cof cofVar) {
        this.f8498b = context;
        this.f8500d = executorService;
        this.f8499c = cofVar;
    }

    /* JADX INFO: renamed from: a */
    public final mrm m5213a(Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments == null || pathSegments.size() != MediaStore.Images.Media.EXTERNAL_CONTENT_URI.getPathSegments().size() + 1) {
            return mqu.f41450a;
        }
        mkv.m16515W(pathSegments);
        return mrm.m16829i((String) mkv.m16515W(pathSegments));
    }

    /* JADX INFO: renamed from: b */
    public final nps m5214b(List list) {
        nps npsVarM17554j = nod.m17554j(npm.m17611q(nod.m17553i(npm.m17611q(nod.m17553i(npm.m17611q(kxk.m14970P(new cnn(this, list, 2), this.f8500d)), new ceg(list, 6), this.f8500d)), cgh.f5598n, this.f8500d)), new cnc(this, 3), this.f8500d);
        cof cofVar = this.f8499c;
        cofVar.getClass();
        return nod.m17554j(npsVarM17554j, new cnc(cofVar, 4), this.f8500d);
    }
}
