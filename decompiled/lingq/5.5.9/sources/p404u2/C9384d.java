package p404u2;

import com.android.installreferrer.api.InstallReferrerClient;
import com.google.common.collect.AbstractC3177a0;
import java.util.Comparator;
import la.C7294b;
import p397ta.C9238f;
import ua.C9496e;

/* JADX INFO: renamed from: u2.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9384d implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48177a;

    public /* synthetic */ C9384d(int i10) {
        this.f48177a = i10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f48177a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i10 = 0; i10 < bArr.length; i10++) {
                    byte b10 = bArr[i10];
                    byte b11 = bArr2[i10];
                    if (b10 != b11) {
                        return b10 - b11;
                    }
                }
                return 0;
            case 1:
                return Integer.compare(((C7294b.a) obj2).f40860b, ((C7294b.a) obj).f40860b);
            case 2:
                return Integer.compare(((C9238f.a) obj).f47906a.f47909b, ((C9238f.a) obj2).f47906a.f47909b);
            case 3:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                AbstractC3177a0<Integer> abstractC3177a0 = C9496e.f48797j;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 4:
                return C9496e.h.m17961g((C9496e.h) obj, (C9496e.h) obj2);
            default:
                return C9496e.h.m17962i((C9496e.h) obj, (C9496e.h) obj2);
        }
    }
}
