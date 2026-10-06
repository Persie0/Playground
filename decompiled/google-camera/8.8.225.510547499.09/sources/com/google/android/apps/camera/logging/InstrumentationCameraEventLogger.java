package com.google.android.apps.camera.logging;

import java.util.ArrayList;
import java.util.List;
import p000.fcq;
import p000.nho;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class InstrumentationCameraEventLogger implements fcq {

    /* JADX INFO: renamed from: a */
    private static final Integer f6813a = 100;

    /* JADX INFO: renamed from: b */
    private static final List f6814b = new ArrayList();

    public static List getAndClearEvents() {
        ArrayList arrayList;
        List list = f6814b;
        synchronized (list) {
            arrayList = new ArrayList(list);
            list.clear();
        }
        return arrayList;
    }

    @Override // p000.fcq
    /* JADX INFO: renamed from: a */
    public final void mo4205a(nho nhoVar) {
        List list = f6814b;
        synchronized (list) {
            int size = list.size();
            f6813a.intValue();
            if (size == 100) {
                list.remove(list.size() - 1);
            }
            list.add(nhoVar);
        }
    }
}
