package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bxi implements bxj {

    /* JADX INFO: renamed from: a */
    private final List f4697a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f4698b;

    /* JADX INFO: renamed from: c */
    private final Object f4699c;

    /* JADX INFO: renamed from: d */
    private final Object f4700d;

    public bxi(InputStream inputStream, List list, btg btgVar, int i) {
        this.f4698b = i;
        bzq.m3278r(btgVar);
        this.f4700d = btgVar;
        bzq.m3278r(list);
        this.f4697a = list;
        this.f4699c = new brl(inputStream, btgVar);
    }

    public bxi(ByteBuffer byteBuffer, List list, btg btgVar, int i) {
        this.f4698b = i;
        this.f4700d = byteBuffer;
        this.f4697a = list;
        this.f4699c = btgVar;
    }

    @Override // p000.bxj
    /* JADX INFO: renamed from: d */
    public final void mo3160d() {
        switch (this.f4698b) {
            case 0:
                ((brl) this.f4699c).f4227a.m3165a();
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [btg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [btg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [btg, java.lang.Object] */
    @Override // p000.bxj
    /* JADX INFO: renamed from: a */
    public final int mo3157a() {
        switch (this.f4698b) {
            case 0:
                return bzq.m3285y(this.f4697a, ((brl) this.f4699c).mo2949a(), this.f4700d);
            case 1:
                List list = this.f4697a;
                ByteBuffer byteBufferM3364c = cav.m3364c((ByteBuffer) this.f4700d);
                ?? r2 = this.f4699c;
                if (byteBufferM3364c == null) {
                    return -1;
                }
                return bzq.m3286z(list, new bqk(byteBufferM3364c, (btg) r2, 1));
            default:
                return bzq.m3286z(this.f4697a, new bqk((bro) this.f4699c, (btg) this.f4700d, 2));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [btg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [btg, java.lang.Object] */
    @Override // p000.bxj
    /* JADX INFO: renamed from: c */
    public final ImageHeaderParser$ImageType mo3159c() {
        switch (this.f4698b) {
            case 0:
                return bzq.m3229B(this.f4697a, ((brl) this.f4699c).mo2949a(), this.f4700d);
            case 1:
                return bzq.m3228A(this.f4697a, cav.m3364c((ByteBuffer) this.f4700d));
            default:
                return bzq.m3230C(this.f4697a, new bqj((bro) this.f4699c, this.f4700d));
        }
    }

    public bxi(ParcelFileDescriptor parcelFileDescriptor, List list, btg btgVar, int i) {
        this.f4698b = i;
        bzq.m3278r(btgVar);
        this.f4700d = btgVar;
        bzq.m3278r(list);
        this.f4697a = list;
        this.f4699c = new bro(parcelFileDescriptor);
    }

    @Override // p000.bxj
    /* JADX INFO: renamed from: b */
    public final Bitmap mo3158b(BitmapFactory.Options options) {
        switch (this.f4698b) {
            case 0:
                return BitmapFactory.decodeStream(((brl) this.f4699c).mo2949a(), null, options);
            case 1:
                return BitmapFactory.decodeStream(cav.m3362a(cav.m3364c((ByteBuffer) this.f4700d)), null, options);
            default:
                return BitmapFactory.decodeFileDescriptor(((bro) this.f4699c).mo2949a().getFileDescriptor(), null, options);
        }
    }
}
