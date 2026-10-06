package p000;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bvb implements bvl {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f4517a;

    /* JADX INFO: renamed from: b */
    private final Object f4518b;

    public bvb(Context context, int i) {
        this.f4517a = i;
        this.f4518b = context;
    }

    public bvb(Context context, int i, byte[] bArr) {
        this.f4517a = i;
        this.f4518b = context.getApplicationContext();
    }

    public bvb(bum bumVar, int i) {
        this.f4517a = i;
        this.f4518b = bumVar;
    }

    public bvb(buz buzVar, int i) {
        this.f4517a = i;
        this.f4518b = buzVar;
    }

    public bvb(bvl bvlVar, int i) {
        this.f4517a = i;
        this.f4518b = bvlVar;
    }

    /* JADX INFO: renamed from: c */
    private static Uri m3093c(String str) {
        return Uri.fromFile(new File(str));
    }

    public bvb(Context context, int i, char[] cArr) {
        this.f4517a = i;
        this.f4518b = context.getApplicationContext();
    }

    @Override // p000.bvl
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean mo3083a(Object obj) {
        switch (this.f4517a) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return bzq.m3282v((Uri) obj);
            case 3:
                return true;
            case 4:
                Uri uri = (Uri) obj;
                return bzq.m3282v(uri) && !bzq.m3284x(uri);
            case 5:
                Uri uri2 = (Uri) obj;
                return bzq.m3282v(uri2) && bzq.m3284x(uri2);
            default:
                return true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [buz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v10, types: [bvl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [bvl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [bum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [bvl, java.lang.Object] */
    @Override // p000.bvl
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1058va mo3084b(Object obj, int i, int i2, bqr bqrVar) {
        Uri uriM3093c;
        Long l;
        switch (this.f4517a) {
            case 0:
                File file = (File) obj;
                return new C1058va(new cat(file), new buy(file, this.f4518b, 0));
            case 1:
                byte[] bArr = (byte[]) obj;
                return new C1058va(new cat(bArr), new bun(bArr, this.f4518b));
            case 2:
                Uri uri = (Uri) obj;
                return new C1058va(new cat(uri), new bvh((Context) this.f4518b, uri));
            case 3:
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    uriM3093c = null;
                } else if (str.charAt(0) == '/') {
                    uriM3093c = m3093c(str);
                } else {
                    Uri uri2 = Uri.parse(str);
                    uriM3093c = uri2.getScheme() == null ? m3093c(str) : uri2;
                }
                if (uriM3093c == null || !this.f4518b.mo3083a(uriM3093c)) {
                    return null;
                }
                return this.f4518b.mo3084b(uriM3093c, i, i2, bqrVar);
            case 4:
                Uri uri3 = (Uri) obj;
                if (!bzq.m3283w(i, i2)) {
                    return null;
                }
                cat catVar = new cat(uri3);
                Context context = (Context) this.f4518b;
                return new C1058va(catVar, buy.m3089b(context, uri3, new brr(context.getContentResolver())));
            case 5:
                Uri uri4 = (Uri) obj;
                if (!bzq.m3283w(i, i2) || (l = (Long) bqrVar.m2927b(bxw.f4724a)) == null || l.longValue() != -1) {
                    return null;
                }
                cat catVar2 = new cat(uri4);
                Context context2 = (Context) this.f4518b;
                return new C1058va(catVar2, buy.m3089b(context2, uri4, new brs(context2.getContentResolver())));
            default:
                return this.f4518b.mo3084b(new bvc((URL) obj), i, i2, bqrVar);
        }
    }
}
