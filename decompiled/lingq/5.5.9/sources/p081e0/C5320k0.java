package p081e0;

import androidx.compose.runtime.ComposerKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C6752c;
import p219ka.InterfaceC6646g;

/* JADX INFO: renamed from: e0.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5320k0 implements InterfaceC6646g {

    /* JADX INFO: renamed from: a */
    public final List f33593a;

    public C5320k0() {
        this.f33593a = new ArrayList();
    }

    public C5320k0(int i10) {
        this.f33593a = new ArrayList();
    }

    public C5320k0(List list) {
        this.f33593a = list;
    }

    @Override // p219ka.InterfaceC6646g
    /* JADX INFO: renamed from: a */
    public int mo11452a(long j10) {
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public void m11453b(int i10) {
        List list = this.f33593a;
        if ((!list.isEmpty()) && (((Number) list.get(0)).intValue() == i10 || ((Number) list.get(list.size() - 1)).intValue() == i10)) {
            return;
        }
        int size = list.size();
        list.add(Integer.valueOf(i10));
        while (size > 0) {
            int i11 = ((size + 1) >>> 1) - 1;
            int iIntValue = ((Number) list.get(i11)).intValue();
            if (i10 <= iIntValue) {
                break;
            }
            list.set(size, Integer.valueOf(iIntValue));
            size = i11;
        }
        list.set(size, Integer.valueOf(i10));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public int m11454c() {
        int iIntValue;
        List list = this.f33593a;
        if (!(list.size() > 0)) {
            ComposerKt.m1687c("Set is empty".toString());
            throw null;
        }
        int iIntValue2 = ((Number) list.get(0)).intValue();
        while ((!list.isEmpty()) && ((Number) list.get(0)).intValue() == iIntValue2) {
            list.set(0, C6752c.m13432Z(list));
            list.remove(list.size() - 1);
            int size = list.size();
            int size2 = list.size() >>> 1;
            int i10 = 0;
            while (i10 < size2) {
                int iIntValue3 = ((Number) list.get(i10)).intValue();
                int i11 = (i10 + 1) * 2;
                int i12 = i11 - 1;
                int iIntValue4 = ((Number) list.get(i12)).intValue();
                if (i11 < size && (iIntValue = ((Number) list.get(i11)).intValue()) > iIntValue4) {
                    if (iIntValue <= iIntValue3) {
                        break;
                    }
                    list.set(i10, Integer.valueOf(iIntValue));
                    list.set(i11, Integer.valueOf(iIntValue3));
                    i10 = i11;
                } else {
                    if (iIntValue4 <= iIntValue3) {
                        break;
                    }
                    list.set(i10, Integer.valueOf(iIntValue4));
                    list.set(i12, Integer.valueOf(iIntValue3));
                    i10 = i12;
                }
            }
        }
        return iIntValue2;
    }

    @Override // p219ka.InterfaceC6646g
    /* JADX INFO: renamed from: f */
    public long mo11455f(int i10) {
        return 0L;
    }

    @Override // p219ka.InterfaceC6646g
    /* JADX INFO: renamed from: g */
    public List mo11456g(long j10) {
        return this.f33593a;
    }

    @Override // p219ka.InterfaceC6646g
    /* JADX INFO: renamed from: i */
    public int mo11457i() {
        return 1;
    }
}
