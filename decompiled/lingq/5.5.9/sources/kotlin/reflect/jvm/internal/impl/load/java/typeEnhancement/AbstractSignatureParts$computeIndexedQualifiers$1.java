package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import cm.InterfaceC2052l;
import hn.C6083c;
import hn.C6089i;
import java.util.Map;
import kotlin.collections.C6744b;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
final class AbstractSignatureParts$computeIndexedQualifiers$1 extends Lambda implements InterfaceC2052l<Integer, C6083c> {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C6089i f38836b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C6083c[] f38837c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractSignatureParts$computeIndexedQualifiers$1(C6089i c6089i, C6083c[] c6083cArr) {
        super(1);
        this.f38836b = c6089i;
        this.f38837c = c6083cArr;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C6083c mo528n(Integer num) {
        C6083c c6083c;
        Map<Integer, C6083c> map;
        int iIntValue = num.intValue();
        C6089i c6089i = this.f38836b;
        if (c6089i == null || (map = c6089i.f35840a) == null || (c6083c = map.get(Integer.valueOf(iIntValue))) == null) {
            if (iIntValue >= 0) {
                C6083c[] c6083cArr = this.f38837c;
                if (iIntValue <= C6744b.m13381m0(c6083cArr)) {
                    return c6083cArr[iIntValue];
                }
            }
            c6083c = C6083c.f35819e;
        }
        return c6083c;
    }
}
