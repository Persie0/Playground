package com.lingq.core.domain.model.lesson;

import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class Note {
    public static final C1457v Companion = new C1457v();

    /* JADX INFO: renamed from: a */
    public final String f19332a;

    /* JADX INFO: renamed from: b */
    public final String f19333b;

    public /* synthetic */ Note(String str, int i, String str2) {
        if (3 != (i & 3)) {
            n3c.m17204b(i, 3, Note$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19332a = str;
        this.f19333b = str2;
    }

    /* JADX INFO: renamed from: a */
    public static Note m8075a(Note note, String str) {
        String str2 = note.f19332a;
        note.getClass();
        str2.getClass();
        str.getClass();
        return new Note(str2, str);
    }

    /* JADX INFO: renamed from: b */
    public final String m8076b() {
        return this.f19332a;
    }

    /* JADX INFO: renamed from: c */
    public final String m8077c() {
        return this.f19333b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Note)) {
            return false;
        }
        Note note = (Note) obj;
        return fa4.m11650l(this.f19332a, note.f19332a) && fa4.m11650l(this.f19333b, note.f19333b);
    }

    public final int hashCode() {
        return this.f19333b.hashCode() + (this.f19332a.hashCode() * 31);
    }

    public final String toString() {
        return ux5.m22991n("Note(language=", this.f19332a, ", text=", this.f19333b, ")");
    }

    public Note(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f19332a = str;
        this.f19333b = str2;
    }
}
