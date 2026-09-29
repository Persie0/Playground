package p000;

import coil.disk.C0860a;
import java.io.Closeable;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes.dex */
public final class ch2 implements Closeable {

    /* JADX INFO: renamed from: a */
    public final ah2 f10082a;

    /* JADX INFO: renamed from: b */
    public boolean f10083b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0860a f10084c;

    public ch2(C0860a c0860a, ah2 ah2Var) {
        this.f10084c = c0860a;
        this.f10082a = ah2Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f10083b) {
            return;
        }
        this.f10083b = true;
        C0860a c0860a = this.f10084c;
        synchronized (c0860a) {
            ah2 ah2Var = this.f10082a;
            int i = ah2Var.f644h - 1;
            ah2Var.f644h = i;
            if (i == 0 && ah2Var.f642f) {
                Regex regex = C0860a.f10450L;
                c0860a.m4966u(ah2Var);
            }
        }
    }
}
