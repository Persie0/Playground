package p000;

import com.google.android.apps.camera.zoomui.view.WdNM.xPAWq;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.RawWriteView;
import com.google.googlex.gcam.base.LongPair;
import com.google.googlex.gcam.clientallocator.RawClientAllocator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class nsp implements RawClientAllocator {

    /* JADX INFO: renamed from: a */
    public nsa f44424a;

    /* JADX INFO: renamed from: b */
    public boolean f44425b = false;

    public nsp() {
        lku.m15669w(GcamModuleJNI.kInvalidAllocationId_get() != 0);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0023  */
    /* JADX WARN: Code duplicated, block: B:20:0x0042 A[LOOP:0: B:14:0x001f->B:20:0x0042, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0029 A[EDGE_INSN: B:24:0x0029->B:18:0x0029 BREAK  A[LOOP:0: B:14:0x001f->B:20:0x0042], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0045 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[SYNTHETIC] */
    @Override // com.google.googlex.gcam.clientallocator.RawClientAllocator
    public final LongPair allocate(int i, int i2, int i3) {
        nrz[] nrzVarArr;
        nrz nrzVar;
        int i4 = 0;
        lku.m15614I(this.f44424a == null, "allocate() should be called at most once.");
        nrz[] nrzVarArr2 = nrz.f44329e;
        if (i3 >= 4 || i3 < 0) {
            while (true) {
                nrzVarArr = nrz.f44329e;
                if (i4 < 4) {
                    throw new IllegalArgumentException(xPAWq.Olh + nrz.class.toString() + " with value " + i3);
                }
                nrzVar = nrzVarArr[i4];
                if (nrzVar.f44331f == i3) {
                    break;
                }
                i4++;
            }
        } else {
            nrzVar = nrzVarArr2[i3];
            if (nrzVar.f44331f != i3) {
                while (true) {
                    nrzVarArr = nrz.f44329e;
                    if (i4 < 4) {
                        throw new IllegalArgumentException(xPAWq.Olh + nrz.class.toString() + " with value " + i3);
                    }
                    nrzVar = nrzVarArr[i4];
                    if (nrzVar.f44331f == i3) {
                        break;
                        break;
                    }
                    i4++;
                }
            }
        }
        this.f44424a = new nsa(GcamModuleJNI.new_RawImage__SWIG_1(i, i2, nrzVar.f44331f));
        return new LongPair(0L, RawWriteView.m5092c(this.f44424a));
    }

    @Override // com.google.googlex.gcam.clientallocator.RawClientAllocator
    public final void doneWriting(long j) {
        lku.m15669w(j == 0);
        lku.m15614I(this.f44424a != null, "doneWriting() was called before allocate().");
        lku.m15614I(!this.f44425b, "doneWriting() should be called at most once.");
        this.f44425b = true;
    }
}
