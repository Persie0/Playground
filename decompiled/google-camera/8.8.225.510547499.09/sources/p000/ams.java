package p000;

import com.google.android.apps.camera.brella.mediastore.p007hP.wUzNh;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ams {

    /* JADX INFO: renamed from: a */
    private final List f725a;

    /* JADX INFO: renamed from: b */
    private boolean f726b;

    /* JADX INFO: renamed from: c */
    private int f727c;

    /* JADX INFO: renamed from: d */
    private String f728d;

    public ams() {
        this(null);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized ByteBuffer m970a() {
        ArrayList arrayList;
        this.f726b = true;
        String str = this.f728d;
        int i = this.f727c;
        List list = this.f725a;
        arrayList = new ArrayList();
        byte[] bytes = str.getBytes(mrd.f41463a);
        if (bytes.length != 4) {
            throw new IllegalArgumentException("Major brand " + str + " is invalid");
        }
        arrayList.add(ByteBuffer.wrap(bytes));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt(i);
        byteBufferAllocate.flip();
        arrayList.add(byteBufferAllocate);
        for (int i2 = 0; i2 < list.size(); i2++) {
            String str2 = (String) list.get(i2);
            byte[] bytes2 = str2.getBytes(mrd.f41463a);
            if (bytes2.length != 4) {
                throw new IllegalArgumentException("Compatible brand " + str2 + " is invalid");
            }
            arrayList.add(ByteBuffer.wrap(bytes2));
        }
        return acv.m241j("ftyp", arrayList);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m971b(String str) {
        if (!this.f725a.contains(str)) {
            if (this.f726b) {
                throw new IllegalStateException(wUzNh.THZlY + str + " as ftyp has already been written.");
            }
            this.f725a.add(str);
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m972c(String str, int i) {
        if (this.f726b) {
            throw new IllegalStateException("Can't change major brand as ftyp has already been written");
        }
        this.f728d = "isom";
        this.f727c = 131072;
    }

    public ams(byte[] bArr) {
        this.f725a = new ArrayList();
        this.f726b = false;
    }
}
