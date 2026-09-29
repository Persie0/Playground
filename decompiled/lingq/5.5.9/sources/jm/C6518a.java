package jm;

import java.util.Iterator;
import p100em.InterfaceC5429a;
import p349qo.C8656b;

/* JADX INFO: renamed from: jm.a */
/* JADX INFO: loaded from: classes2.dex */
public class C6518a implements Iterable<Character>, InterfaceC5429a {

    /* JADX INFO: renamed from: a */
    public final char f37154a;

    /* JADX INFO: renamed from: b */
    public final char f37155b;

    /* JADX INFO: renamed from: c */
    public final int f37156c = 1;

    public C6518a(char c10, char c11) {
        this.f37154a = c10;
        this.f37155b = (char) C8656b.m16915w(c10, c11, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator<Character> iterator() {
        return new C6519b(this.f37154a, this.f37155b, this.f37156c);
    }
}
