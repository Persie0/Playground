package p235l5;

import androidx.work.impl.WorkDatabase;
import p026b5.AbstractC1314g;
import p026b5.InterfaceC1311d;
import p191j5.InterfaceC6408a;
import p214k5.InterfaceC6618t;
import p257m5.InterfaceC7479a;

/* JADX INFO: renamed from: l5.y */
/* JADX INFO: loaded from: classes.dex */
public final class C7278y implements InterfaceC1311d {

    /* JADX INFO: renamed from: a */
    public final InterfaceC7479a f40790a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC6408a f40791b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC6618t f40792c;

    static {
        AbstractC1314g.m4868f("WMFgUpdater");
    }

    public C7278y(WorkDatabase workDatabase, InterfaceC6408a interfaceC6408a, InterfaceC7479a interfaceC7479a) {
        this.f40791b = interfaceC6408a;
        this.f40790a = interfaceC7479a;
        this.f40792c = workDatabase.mo4718z();
    }
}
