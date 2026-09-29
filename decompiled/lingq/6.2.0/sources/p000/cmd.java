package p000;

import com.google.common.collect.ImmutableSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class cmd {

    /* JADX INFO: renamed from: d */
    public static final amd f10292d = new amd();

    /* JADX INFO: renamed from: a */
    public final cmd f10293a;

    /* JADX INFO: renamed from: b */
    public final l79 f10294b;

    /* JADX INFO: renamed from: c */
    public boolean f10295c = false;

    public /* synthetic */ cmd(cmd cmdVar, l79 l79Var) {
        if (cmdVar != null) {
            bna.m3969q(cmdVar.f10295c);
        }
        this.f10293a = cmdVar;
        this.f10294b = l79Var;
    }

    /* JADX INFO: renamed from: a */
    public static cmd m4875a(cmd cmdVar, cmd cmdVar2) {
        cmdVar.getClass();
        cmd cmdVar3 = bmd.f8701e;
        if (cmdVar == cmdVar3) {
            return cmdVar2;
        }
        cmdVar2.getClass();
        if (cmdVar2 == cmdVar3) {
            return cmdVar;
        }
        ImmutableSet<cmd> immutableSetM6307m = ImmutableSet.m6307m(new Object[]{cmdVar, cmdVar2}, 2);
        if (immutableSetM6307m.isEmpty()) {
            return cmdVar3;
        }
        if (immutableSetM6307m.size() == 1) {
            return (cmd) immutableSetM6307m.iterator().next();
        }
        int i = 0;
        for (cmd cmdVar4 : immutableSetM6307m) {
            do {
                i += cmdVar4.f10294b.f49254c;
                cmdVar4 = cmdVar4.f10293a;
            } while (cmdVar4 != null);
        }
        if (i == 0) {
            return bmd.f8701e;
        }
        l79 l79Var = new l79(i);
        for (cmd cmdVar5 : immutableSetM6307m) {
            do {
                int i2 = 0;
                while (true) {
                    l79 l79Var2 = cmdVar5.f10294b;
                    if (i2 >= l79Var2.f49254c) {
                        break;
                    }
                    bna.m3971r(l79Var.put((amd) l79Var2.m15974f(i2), l79Var2.m15977i(i2)) == null, "Duplicate bindings: %s", l79Var2.m15974f(i2));
                    i2++;
                }
                cmdVar5 = cmdVar5.f10293a;
            } while (cmdVar5 != null);
        }
        return new bmd(null, l79Var).m4876b();
    }

    /* JADX INFO: renamed from: b */
    public final cmd m4876b() {
        if (this.f10295c) {
            C3386nv.m17633t("Already frozen");
            return null;
        }
        this.f10295c = true;
        cmd cmdVar = this.f10293a;
        return (cmdVar == null || !this.f10294b.isEmpty()) ? this : cmdVar;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m4877c() {
        if (this.f10294b.containsKey(f10292d)) {
            return true;
        }
        cmd cmdVar = this.f10293a;
        return cmdVar != null && cmdVar.m4877c();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanExtras<");
        for (cmd cmdVar = this; cmdVar != null; cmdVar = cmdVar.f10293a) {
            for (int i = 0; i < cmdVar.f10294b.f49254c; i++) {
                sb.append("[");
                sb.append(this.f10294b.m15977i(i));
                sb.append("], ");
            }
        }
        sb.append(">");
        return sb.toString();
    }
}
