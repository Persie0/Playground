package p000;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class l7d implements Comparable {

    /* JADX INFO: renamed from: c */
    public static final AtomicReferenceFieldUpdater f49281c = AtomicReferenceFieldUpdater.newUpdater(l7d.class, Object.class, "b");

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ long f49282d = m7d.f50741a.objectFieldOffset(l7d.class.getDeclaredField("b"));

    /* JADX INFO: renamed from: a */
    public final String f49283a;

    /* JADX INFO: renamed from: b */
    public volatile Object f49284b;

    public /* synthetic */ l7d(String str, byte[] bArr) {
        this.f49283a = str;
        this.f49284b = bArr;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String m15985a() {
        return this.f49283a;
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m15986b(byte[] bArr) {
        byte[][] bArr2;
        l7d l7dVar;
        int i = 0;
        while (true) {
            Object obj = this.f49284b;
            if (!(obj instanceof byte[])) {
                byte[][] bArr3 = (byte[][]) obj;
                while (true) {
                    int length = bArr3.length;
                    if (i >= length) {
                        bArr2 = (byte[][]) Arrays.copyOf(bArr3, length + 1);
                        bArr2[length] = bArr;
                        break;
                    } else if (Arrays.equals(bArr, bArr3[i])) {
                        return;
                    } else {
                        i++;
                    }
                }
            } else {
                byte[] bArr4 = (byte[]) obj;
                if (Arrays.equals(bArr, bArr4)) {
                    return;
                }
                i = 1;
                bArr2 = new byte[][]{bArr4, bArr};
            }
            byte[][] bArr5 = bArr2;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f49281c;
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                Unsafe unsafe = m7d.f50741a;
                long j = f49282d;
                l7dVar = this;
                if (unsafe.compareAndSwapObject(l7dVar, j, obj, bArr5)) {
                    return;
                }
                if (unsafe.getObjectVolatile(l7dVar, j) != obj) {
                    break;
                } else {
                    this = l7dVar;
                }
            }
            this = l7dVar;
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.f49283a.compareTo((String) obj);
    }
}
