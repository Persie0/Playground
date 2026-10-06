package p000;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class awe extends awf {

    /* JADX INFO: renamed from: a */
    private final Object f2577a;

    /* JADX INFO: renamed from: b */
    private final String f2578b;

    public awe(Object obj, String str) {
        Collection collectionM18666F;
        this.f2577a = obj;
        this.f2578b = str;
        awi awiVar = new awi(str + " value: " + obj);
        StackTraceElement[] stackTrace = awiVar.getStackTrace();
        stackTrace.getClass();
        int length = stackTrace.length;
        int iM18789c = ook.m18789c(length + (-2), 0);
        if (iM18789c < 0) {
            throw new IllegalArgumentException("Requested element count " + iM18789c + " is less than zero.");
        }
        if (iM18789c == 0) {
            collectionM18666F = okv.f46215a;
        } else if (iM18789c >= length) {
            collectionM18666F = omn.m18687aa(stackTrace);
        } else if (iM18789c == 1) {
            collectionM18666F = omn.m18666F(stackTrace[length - 1]);
        } else {
            ArrayList arrayList = new ArrayList(iM18789c);
            for (int i = length - iM18789c; i < length; i++) {
                arrayList.add(stackTrace[i]);
            }
            collectionM18666F = arrayList;
        }
        awiVar.setStackTrace((StackTraceElement[]) collectionM18666F.toArray(new StackTraceElement[0]));
    }

    @Override // p000.awf
    /* JADX INFO: renamed from: a */
    public final awf mo2072a(String str, oni oniVar) {
        return this;
    }

    @Override // p000.awf
    /* JADX INFO: renamed from: b */
    public final Object mo2073b() {
        return null;
    }
}
