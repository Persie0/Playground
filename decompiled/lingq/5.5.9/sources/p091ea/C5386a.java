package p091ea;

import android.support.v4.media.AbstractC0140a;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.scte35.PrivateCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceNullCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand;
import com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand;
import com.kochava.tracker.BuildConfig;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p357r6.C8739a;
import p479xa.C10130a0;
import p479xa.C10151t;
import p529z9.C10463c;

/* JADX INFO: renamed from: ea.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5386a extends AbstractC0140a {

    /* JADX INFO: renamed from: a */
    public final C10151t f33804a = new C10151t();

    /* JADX INFO: renamed from: b */
    public final C8739a f33805b = new C8739a();

    /* JADX INFO: renamed from: c */
    public C10130a0 f33806c;

    /* JADX WARN: Code duplicated, block: B:15:0x0017  */
    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: p */
    public final Metadata mo211p(C10463c c10463c, ByteBuffer byteBuffer) {
        Metadata.Entry spliceNullCommand;
        Metadata.Entry spliceScheduleCommand;
        long j10;
        long j11;
        int i10;
        ArrayList arrayList;
        long j12;
        long j13;
        boolean z10;
        boolean z11;
        boolean z12;
        int iM19150y;
        int iM19145t;
        int iM19145t2;
        long jM19146u;
        boolean z13;
        List list;
        long j14;
        long j15;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        int i11;
        int i12;
        int iM19145t3;
        boolean z18;
        long j16;
        C10130a0 c10130a0 = this.f33806c;
        if (c10130a0 != null) {
            long j17 = c10463c.f52330i;
            synchronized (c10130a0) {
                j16 = c10130a0.f51350b;
            }
            if (j17 != j16) {
                C10130a0 c10130a1 = new C10130a0(c10463c.f12118e);
                this.f33806c = c10130a1;
                c10130a1.m19003a(c10463c.f12118e - c10463c.f52330i);
            }
        } else {
            C10130a0 c10130a2 = new C10130a0(c10463c.f12118e);
            this.f33806c = c10130a2;
            c10130a2.m19003a(c10463c.f12118e - c10463c.f52330i);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        C10151t c10151t = this.f33804a;
        c10151t.m19122C(bArrArray, iLimit);
        C8739a c8739a = this.f33805b;
        c8739a.m16973j(bArrArray, iLimit);
        c8739a.m16976m(39);
        long jM16970g = (((long) c8739a.m16970g(1)) << 32) | ((long) c8739a.m16970g(32));
        c8739a.m16976m(20);
        int iM16970g = c8739a.m16970g(12);
        int iM16970g2 = c8739a.m16970g(8);
        c10151t.m19125F(14);
        if (iM16970g2 == 0) {
            spliceNullCommand = new SpliceNullCommand();
        } else if (iM16970g2 != 255) {
            long j18 = 0;
            long j19 = 1;
            long jM19146u2 = -9223372036854775807L;
            if (iM16970g2 == 4) {
                int iM19145t4 = c10151t.m19145t();
                ArrayList arrayList2 = new ArrayList(iM19145t4);
                int i13 = 0;
                while (i13 < iM19145t4) {
                    long jM19146u3 = c10151t.m19146u();
                    boolean z19 = (c10151t.m19145t() & BuildConfig.SDK_TRUNCATE_LENGTH) != 0;
                    ArrayList arrayList3 = new ArrayList();
                    if (z19) {
                        j10 = j18;
                        j11 = j19;
                        i10 = iM19145t4;
                        arrayList = arrayList3;
                        j12 = -9223372036854775807L;
                        j13 = -9223372036854775807L;
                        z10 = false;
                        z11 = false;
                        z12 = false;
                        iM19150y = 0;
                        iM19145t = 0;
                        iM19145t2 = 0;
                    } else {
                        int iM19145t5 = c10151t.m19145t();
                        boolean z20 = (iM19145t5 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0;
                        boolean z21 = (iM19145t5 & 64) != 0;
                        boolean z22 = (iM19145t5 & 32) != 0;
                        long jM19146u4 = z21 ? c10151t.m19146u() : -9223372036854775807L;
                        if (z21) {
                            i10 = iM19145t4;
                        } else {
                            int iM19145t6 = c10151t.m19145t();
                            ArrayList arrayList4 = new ArrayList(iM19145t6);
                            int i14 = 0;
                            while (i14 < iM19145t6) {
                                arrayList4.add(new SpliceScheduleCommand.C2459b(c10151t.m19145t(), c10151t.m19146u()));
                                i14++;
                                iM19145t4 = iM19145t4;
                            }
                            i10 = iM19145t4;
                            arrayList3 = arrayList4;
                        }
                        if (z22) {
                            long jM19145t = c10151t.m19145t();
                            j10 = 0;
                            z13 = (jM19145t & 128) != 0;
                            j11 = 1;
                            jM19146u = ((((jM19145t & 1) << 32) | c10151t.m19146u()) * 1000) / 90;
                        } else {
                            j11 = 1;
                            j10 = 0;
                            jM19146u = -9223372036854775807L;
                            z13 = false;
                        }
                        z12 = z13;
                        arrayList = arrayList3;
                        z10 = z20;
                        z11 = z21;
                        j12 = jM19146u4;
                        j13 = jM19146u;
                        iM19150y = c10151t.m19150y();
                        iM19145t = c10151t.m19145t();
                        iM19145t2 = c10151t.m19145t();
                    }
                    arrayList2.add(new SpliceScheduleCommand.C2460c(jM19146u3, z19, z10, z11, arrayList, j12, z12, j13, iM19150y, iM19145t, iM19145t2));
                    i13++;
                    iM19145t4 = i10;
                    j18 = j10;
                    j19 = j11;
                }
                spliceScheduleCommand = new SpliceScheduleCommand(arrayList2);
            } else if (iM16970g2 == 5) {
                C10130a0 c10130a3 = this.f33806c;
                long jM19146u5 = c10151t.m19146u();
                boolean z23 = (c10151t.m19145t() & BuildConfig.SDK_TRUNCATE_LENGTH) != 0;
                List listEmptyList = Collections.emptyList();
                if (z23) {
                    list = listEmptyList;
                    j14 = -9223372036854775807L;
                    j15 = -9223372036854775807L;
                    z14 = false;
                    z15 = false;
                    z16 = false;
                    z17 = false;
                    i11 = 0;
                    i12 = 0;
                    iM19145t3 = 0;
                } else {
                    int iM19145t7 = c10151t.m19145t();
                    boolean z24 = (iM19145t7 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0;
                    boolean z25 = (iM19145t7 & 64) != 0;
                    boolean z26 = (iM19145t7 & 32) != 0;
                    boolean z27 = (iM19145t7 & 16) != 0;
                    long jM7212a = (!z25 || z27) ? -9223372036854775807L : TimeSignalCommand.m7212a(jM16970g, c10151t);
                    if (!z25) {
                        int iM19145t8 = c10151t.m19145t();
                        ArrayList arrayList5 = new ArrayList(iM19145t8);
                        for (int i15 = 0; i15 < iM19145t8; i15++) {
                            int iM19145t9 = c10151t.m19145t();
                            long jM7212a2 = !z27 ? TimeSignalCommand.m7212a(jM16970g, c10151t) : -9223372036854775807L;
                            arrayList5.add(new SpliceInsertCommand.C2456b(iM19145t9, jM7212a2, c10130a3.m19004b(jM7212a2)));
                        }
                        listEmptyList = arrayList5;
                    }
                    if (z26) {
                        long jM19145t2 = c10151t.m19145t();
                        z18 = (jM19145t2 & 128) != 0;
                        jM19146u2 = ((((jM19145t2 & 1) << 32) | c10151t.m19146u()) * 1000) / 90;
                    } else {
                        z18 = false;
                    }
                    int iM19150y2 = c10151t.m19150y();
                    int iM19145t10 = c10151t.m19145t();
                    z17 = z18;
                    iM19145t3 = c10151t.m19145t();
                    list = listEmptyList;
                    z14 = z24;
                    i11 = iM19150y2;
                    i12 = iM19145t10;
                    j15 = jM19146u2;
                    j14 = jM7212a;
                    z16 = z27;
                    z15 = z25;
                }
                spliceScheduleCommand = new SpliceInsertCommand(jM19146u5, z23, z14, z15, z16, j14, c10130a3.m19004b(j14), list, z17, j15, i11, i12, iM19145t3);
            } else if (iM16970g2 != 6) {
                spliceNullCommand = null;
            } else {
                C10130a0 c10130a4 = this.f33806c;
                long jM7212a3 = TimeSignalCommand.m7212a(jM16970g, c10151t);
                spliceNullCommand = new TimeSignalCommand(jM7212a3, c10130a4.m19004b(jM7212a3));
            }
            spliceNullCommand = spliceScheduleCommand;
        } else {
            long jM19146u6 = c10151t.m19146u();
            int i16 = iM16970g - 4;
            byte[] bArr = new byte[i16];
            c10151t.m19127b(bArr, 0, i16);
            spliceNullCommand = new PrivateCommand(jM19146u6, bArr, jM16970g);
        }
        return spliceNullCommand == null ? new Metadata(new Metadata.Entry[0]) : new Metadata(spliceNullCommand);
    }
}
