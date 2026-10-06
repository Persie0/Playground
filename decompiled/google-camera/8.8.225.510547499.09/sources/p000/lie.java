package p000;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lie {

    /* JADX INFO: renamed from: a */
    public final Object f38294a;

    /* JADX INFO: renamed from: b */
    public final Object f38295b;

    /* JADX INFO: renamed from: c */
    public final Object f38296c;

    /* JADX INFO: renamed from: d */
    public final Object f38297d;

    public lie(String str, lpe lpeVar, ksi ksiVar, oju ojuVar, byte[] bArr) {
        this.f38296c = str;
        this.f38294a = lpeVar;
        this.f38295b = ksiVar;
        this.f38297d = ojuVar;
    }

    public lie(lrz lrzVar) {
        this.f38295b = lrzVar.f39110a;
        this.f38297d = lrzVar.f39111b;
        this.f38296c = lrzVar.f39112c;
        this.f38294a = lrzVar.f39113d;
    }

    public lie(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        ojuVar.getClass();
        this.f38294a = ojuVar;
        this.f38295b = ojuVar2;
        ojuVar3.getClass();
        this.f38297d = ojuVar3;
        ojuVar4.getClass();
        this.f38296c = ojuVar4;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: a */
    public final List m15382a(OutputStream outputStream) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(outputStream);
        if (!this.f38296c.isEmpty()) {
            ?? r1 = this.f38296c;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = r1.iterator();
            while (it.hasNext()) {
                lta ltaVarM15957b = ((ltb) it.next()).m15957b();
                if (ltaVarM15957b != null) {
                    arrayList2.add(ltaVarM15957b);
                }
            }
            lry lryVar = !arrayList2.isEmpty() ? new lry(outputStream, arrayList2) : null;
            if (lryVar != null) {
                arrayList.add(lryVar);
            }
        }
        for (ltc ltcVar : this.f38297d) {
            arrayList.add(ltcVar.m15961d());
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    public lie(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, byte[] bArr) {
        ojuVar.getClass();
        this.f38294a = ojuVar;
        ojuVar2.getClass();
        this.f38296c = ojuVar2;
        ojuVar3.getClass();
        this.f38297d = ojuVar3;
        this.f38295b = ojuVar4;
    }
}
