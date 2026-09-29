package p075dh;

import android.content.Context;
import com.kochava.core.storage.queue.internal.StorageQueueChangedAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p179ig.C6326a;
import p179ig.InterfaceC6327b;
import p243lg.InterfaceC7361c;
import p349qo.C8656b;

/* JADX INFO: renamed from: dh.e */
/* JADX INFO: loaded from: classes.dex */
public final class C5177e implements InterfaceC6327b {

    /* JADX INFO: renamed from: a */
    public final C6326a f33205a;

    /* JADX INFO: renamed from: b */
    public final List<InterfaceC5178f> f33206b = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: c */
    public boolean f33207c = false;

    public C5177e(Context context, InterfaceC7361c interfaceC7361c, String str) {
        this.f33205a = new C6326a(context, interfaceC7361c, str, Math.max(1, 100));
    }

    @Override // p179ig.InterfaceC6327b
    /* JADX INFO: renamed from: a */
    public final void mo10961a(StorageQueueChangedAction storageQueueChangedAction) {
        ArrayList arrayListM16896W = C8656b.m16896W(this.f33206b);
        if (arrayListM16896W.isEmpty()) {
            return;
        }
        Iterator it = arrayListM16896W.iterator();
        while (it.hasNext()) {
            ((InterfaceC5178f) it.next()).mo10965f(storageQueueChangedAction);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final synchronized void m10962b(InterfaceC5175c interfaceC5175c) {
        this.f33205a.m12951c(((C5174b) interfaceC5175c).m10958i().toString());
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m10963c(InterfaceC5178f interfaceC5178f) {
        try {
            this.f33206b.remove(interfaceC5178f);
            this.f33206b.add(interfaceC5178f);
            if (!this.f33207c) {
                List<InterfaceC6327b> list = this.f33205a.f36558d;
                list.remove(this);
                list.add(this);
                this.f33207c = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public final synchronized int m10964d() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f33205a.m12953e();
    }
}
