package com.google.android.exoplayer2.source;

import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.AbstractC2382c0;
import com.google.android.exoplayer2.drm.InterfaceC2398b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p174i9.C6215e0;
import p454wa.InterfaceC9894s;
import p479xa.C10129a;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2471a implements InterfaceC2492i {
    private Looper looper;
    private C6215e0 playerId;
    private AbstractC2382c0 timeline;
    private final ArrayList<InterfaceC2492i.c> mediaSourceCallers = new ArrayList<>(1);
    private final HashSet<InterfaceC2492i.c> enabledMediaSourceCallers = new HashSet<>(1);
    private final InterfaceC2493j.a eventDispatcher = new InterfaceC2493j.a();
    private final InterfaceC2398b.a drmEventDispatcher = new InterfaceC2398b.a();

    @Override // com.google.android.exoplayer2.source.InterfaceC2492i
    public final void addDrmEventListener(Handler handler, InterfaceC2398b interfaceC2398b) {
        handler.getClass();
        interfaceC2398b.getClass();
        InterfaceC2398b.a aVar = this.drmEventDispatcher;
        aVar.getClass();
        aVar.f12202c.add(new InterfaceC2398b.a.C10600a(handler, interfaceC2398b));
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2492i
    public final void addEventListener(Handler handler, InterfaceC2493j interfaceC2493j) {
        handler.getClass();
        interfaceC2493j.getClass();
        InterfaceC2493j.a aVar = this.eventDispatcher;
        aVar.getClass();
        aVar.f13291c.add(new InterfaceC2493j.a.C10601a(handler, interfaceC2493j));
    }

    public final InterfaceC2398b.a createDrmEventDispatcher(int i10, InterfaceC2492i.b bVar) {
        return new InterfaceC2398b.a(this.drmEventDispatcher.f12202c, i10, bVar);
    }

    public final InterfaceC2398b.a createDrmEventDispatcher(InterfaceC2492i.b bVar) {
        return new InterfaceC2398b.a(this.drmEventDispatcher.f12202c, 0, bVar);
    }

    public final InterfaceC2493j.a createEventDispatcher(int i10, InterfaceC2492i.b bVar, long j10) {
        return new InterfaceC2493j.a(this.eventDispatcher.f13291c, i10, bVar, j10);
    }

    public final InterfaceC2493j.a createEventDispatcher(InterfaceC2492i.b bVar) {
        return new InterfaceC2493j.a(this.eventDispatcher.f13291c, 0, bVar, 0L);
    }

    public final InterfaceC2493j.a createEventDispatcher(InterfaceC2492i.b bVar, long j10) {
        bVar.getClass();
        return new InterfaceC2493j.a(this.eventDispatcher.f13291c, 0, bVar, j10);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2492i
    public final void disable(InterfaceC2492i.c cVar) {
        boolean z10 = !this.enabledMediaSourceCallers.isEmpty();
        this.enabledMediaSourceCallers.remove(cVar);
        if (z10 && this.enabledMediaSourceCallers.isEmpty()) {
            disableInternal();
        }
    }

    public void disableInternal() {
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2492i
    public final void enable(InterfaceC2492i.c cVar) {
        this.looper.getClass();
        boolean zIsEmpty = this.enabledMediaSourceCallers.isEmpty();
        this.enabledMediaSourceCallers.add(cVar);
        if (zIsEmpty) {
            enableInternal();
        }
    }

    public void enableInternal() {
    }

    public final C6215e0 getPlayerId() {
        C6215e0 c6215e0 = this.playerId;
        C10129a.m18993e(c6215e0);
        return c6215e0;
    }

    public final boolean isEnabled() {
        return !this.enabledMediaSourceCallers.isEmpty();
    }

    public final void prepareSource(InterfaceC2492i.c cVar, InterfaceC9894s interfaceC9894s) {
        prepareSource(cVar, interfaceC9894s, C6215e0.f36163b);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2492i
    public final void prepareSource(InterfaceC2492i.c cVar, InterfaceC9894s interfaceC9894s, C6215e0 c6215e0) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.looper;
        C10129a.m18990b(looper == null || looper == looperMyLooper);
        this.playerId = c6215e0;
        AbstractC2382c0 abstractC2382c0 = this.timeline;
        this.mediaSourceCallers.add(cVar);
        if (this.looper == null) {
            this.looper = looperMyLooper;
            this.enabledMediaSourceCallers.add(cVar);
            prepareSourceInternal(interfaceC9894s);
        } else if (abstractC2382c0 != null) {
            enable(cVar);
            cVar.mo7325a(this, abstractC2382c0);
        }
    }

    public abstract void prepareSourceInternal(InterfaceC9894s interfaceC9894s);

    public final void refreshSourceInfo(AbstractC2382c0 abstractC2382c0) {
        this.timeline = abstractC2382c0;
        Iterator<InterfaceC2492i.c> it = this.mediaSourceCallers.iterator();
        while (it.hasNext()) {
            it.next().mo7325a(this, abstractC2382c0);
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2492i
    public final void releaseSource(InterfaceC2492i.c cVar) {
        this.mediaSourceCallers.remove(cVar);
        if (!this.mediaSourceCallers.isEmpty()) {
            disable(cVar);
            return;
        }
        this.looper = null;
        this.timeline = null;
        this.playerId = null;
        this.enabledMediaSourceCallers.clear();
        releaseSourceInternal();
    }

    public abstract void releaseSourceInternal();

    @Override // com.google.android.exoplayer2.source.InterfaceC2492i
    public final void removeDrmEventListener(InterfaceC2398b interfaceC2398b) {
        CopyOnWriteArrayList<InterfaceC2398b.a.C10600a> copyOnWriteArrayList = this.drmEventDispatcher.f12202c;
        while (true) {
            for (InterfaceC2398b.a.C10600a c10600a : copyOnWriteArrayList) {
                if (c10600a.f12204b == interfaceC2398b) {
                    copyOnWriteArrayList.remove(c10600a);
                }
            }
            return;
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2492i
    public final void removeEventListener(InterfaceC2493j interfaceC2493j) {
        CopyOnWriteArrayList<InterfaceC2493j.a.C10601a> copyOnWriteArrayList = this.eventDispatcher.f13291c;
        while (true) {
            for (InterfaceC2493j.a.C10601a c10601a : copyOnWriteArrayList) {
                if (c10601a.f13294b == interfaceC2493j) {
                    copyOnWriteArrayList.remove(c10601a);
                }
            }
            return;
        }
    }
}
