package com.google.android.exoplayer2.source;

import androidx.fragment.app.C0987y;
import com.google.android.exoplayer2.AbstractC2382c0;
import com.google.android.exoplayer2.C2466p;
import com.google.common.collect.C3204w;
import com.google.common.collect.C3206y;
import com.google.common.collect.InterfaceC3203v;
import ga.InterfaceC5720c;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import p392t5.C9203i;
import p454wa.InterfaceC9877b;
import p454wa.InterfaceC9894s;

/* JADX INFO: loaded from: classes.dex */
public final class MergingMediaSource extends AbstractC2475c<Integer> {

    /* JADX INFO: renamed from: l */
    public static final C2466p f13023l;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2492i[] f13024d;

    /* JADX INFO: renamed from: e */
    public final AbstractC2382c0[] f13025e;

    /* JADX INFO: renamed from: f */
    public final ArrayList<InterfaceC2492i> f13026f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC5720c f13027g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC3203v<Object, C2474b> f13028h;

    /* JADX INFO: renamed from: i */
    public int f13029i;

    /* JADX INFO: renamed from: j */
    public long[][] f13030j;

    /* JADX INFO: renamed from: k */
    public IllegalMergeException f13031k;

    public static final class IllegalMergeException extends IOException {
    }

    static {
        C2466p.a aVar = new C2466p.a();
        aVar.f12777a = "MergingMediaSource";
        f13023l = aVar.m7213a();
    }

    public MergingMediaSource(InterfaceC2492i... interfaceC2492iArr) {
        C9203i c9203i = new C9203i(4);
        this.f13024d = interfaceC2492iArr;
        this.f13027g = c9203i;
        this.f13026f = new ArrayList<>(Arrays.asList(interfaceC2492iArr));
        this.f13029i = -1;
        this.f13025e = new AbstractC2382c0[interfaceC2492iArr.length];
        this.f13030j = new long[0][];
        new HashMap();
        C0987y.m3820b("expectedKeys", 8);
        C3204w c3204w = new C3204w();
        C0987y.m3820b("expectedValuesPerKey", 2);
        this.f13028h = new C3206y(c3204w).m9139b();
    }

    @Override // com.google.android.exoplayer2.source.AbstractC2475c
    /* JADX INFO: renamed from: a */
    public final InterfaceC2492i.b mo7246a(Integer num, InterfaceC2492i.b bVar) {
        if (num.intValue() == 0) {
            return bVar;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2492i
    public final InterfaceC2480h createPeriod(InterfaceC2492i.b bVar, InterfaceC9877b interfaceC9877b, long j10) {
        InterfaceC2492i[] interfaceC2492iArr = this.f13024d;
        int length = interfaceC2492iArr.length;
        InterfaceC2480h[] interfaceC2480hArr = new InterfaceC2480h[length];
        AbstractC2382c0[] abstractC2382c0Arr = this.f13025e;
        int iMo6774b = abstractC2382c0Arr[0].mo6774b(bVar.f34757a);
        for (int i10 = 0; i10 < length; i10++) {
            interfaceC2480hArr[i10] = interfaceC2492iArr[i10].createPeriod(bVar.m7324b(abstractC2382c0Arr[i10].mo6780l(iMo6774b)), interfaceC9877b, j10 - this.f13030j[iMo6774b][i10]);
        }
        return new C2494k(this.f13027g, this.f13030j[iMo6774b], interfaceC2480hArr);
    }

    @Override // com.google.android.exoplayer2.source.AbstractC2475c
    /* JADX INFO: renamed from: d */
    public final void mo7247d(Integer num, InterfaceC2492i interfaceC2492i, AbstractC2382c0 abstractC2382c0) {
        Integer num2 = num;
        if (this.f13031k != null) {
            return;
        }
        if (this.f13029i == -1) {
            this.f13029i = abstractC2382c0.mo6905h();
        } else if (abstractC2382c0.mo6905h() != this.f13029i) {
            this.f13031k = new IllegalMergeException();
            return;
        }
        int length = this.f13030j.length;
        AbstractC2382c0[] abstractC2382c0Arr = this.f13025e;
        if (length == 0) {
            this.f13030j = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f13029i, abstractC2382c0Arr.length);
        }
        ArrayList<InterfaceC2492i> arrayList = this.f13026f;
        arrayList.remove(interfaceC2492i);
        abstractC2382c0Arr[num2.intValue()] = abstractC2382c0;
        if (arrayList.isEmpty()) {
            refreshSourceInfo(abstractC2382c0Arr[0]);
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2492i
    public final C2466p getMediaItem() {
        InterfaceC2492i[] interfaceC2492iArr = this.f13024d;
        return interfaceC2492iArr.length > 0 ? interfaceC2492iArr[0].getMediaItem() : f13023l;
    }

    @Override // com.google.android.exoplayer2.source.AbstractC2475c, com.google.android.exoplayer2.source.InterfaceC2492i
    public final void maybeThrowSourceInfoRefreshError() throws IOException {
        IllegalMergeException illegalMergeException = this.f13031k;
        if (illegalMergeException != null) {
            throw illegalMergeException;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // com.google.android.exoplayer2.source.AbstractC2475c, com.google.android.exoplayer2.source.AbstractC2471a
    public final void prepareSourceInternal(InterfaceC9894s interfaceC9894s) {
        super.prepareSourceInternal(interfaceC9894s);
        int i10 = 0;
        while (true) {
            InterfaceC2492i[] interfaceC2492iArr = this.f13024d;
            if (i10 >= interfaceC2492iArr.length) {
                return;
            }
            m7265e(Integer.valueOf(i10), interfaceC2492iArr[i10]);
            i10++;
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2492i
    public final void releasePeriod(InterfaceC2480h interfaceC2480h) {
        C2494k c2494k = (C2494k) interfaceC2480h;
        int i10 = 0;
        while (true) {
            InterfaceC2492i[] interfaceC2492iArr = this.f13024d;
            if (i10 >= interfaceC2492iArr.length) {
                return;
            }
            InterfaceC2492i interfaceC2492i = interfaceC2492iArr[i10];
            InterfaceC2480h interfaceC2480h2 = c2494k.f13295a[i10];
            if (interfaceC2480h2 instanceof C2494k.b) {
                interfaceC2480h2 = ((C2494k.b) interfaceC2480h2).f13306a;
            }
            interfaceC2492i.releasePeriod(interfaceC2480h2);
            i10++;
        }
    }

    @Override // com.google.android.exoplayer2.source.AbstractC2475c, com.google.android.exoplayer2.source.AbstractC2471a
    public final void releaseSourceInternal() {
        super.releaseSourceInternal();
        Arrays.fill(this.f13025e, (Object) null);
        this.f13029i = -1;
        this.f13031k = null;
        ArrayList<InterfaceC2492i> arrayList = this.f13026f;
        arrayList.clear();
        Collections.addAll(arrayList, this.f13024d);
    }
}
