package com.lingq.core.analytics.embedded;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.AbstractC3393o1;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.ux5;
import p000.wf1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class EmbeddedMessageElements {
    public static final C1254d Companion = new C1254d();

    /* JADX INFO: renamed from: i */
    public static final cs4[] f14324i;

    /* JADX INFO: renamed from: a */
    public final String f14325a;

    /* JADX INFO: renamed from: b */
    public final String f14326b;

    /* JADX INFO: renamed from: c */
    public final String f14327c;

    /* JADX INFO: renamed from: d */
    public final String f14328d;

    /* JADX INFO: renamed from: e */
    public final EmbeddedMessageAction f14329e;

    /* JADX INFO: renamed from: f */
    public final List f14330f;

    /* JADX INFO: renamed from: g */
    public final List f14331g;

    /* JADX INFO: renamed from: h */
    public final EmbeddedMessagePayload f14332h;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f14324i = new cs4[]{null, null, null, null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new wf1(10)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new wf1(11)), null};
    }

    public /* synthetic */ EmbeddedMessageElements(int i, String str, String str2, String str3, String str4, EmbeddedMessageAction embeddedMessageAction, List list, List list2, EmbeddedMessagePayload embeddedMessagePayload) {
        if (127 != (i & 127)) {
            n3c.m17204b(i, 127, EmbeddedMessageElements$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f14325a = str;
        this.f14326b = str2;
        this.f14327c = str3;
        this.f14328d = str4;
        this.f14329e = embeddedMessageAction;
        this.f14330f = list;
        this.f14331g = list2;
        if ((i & 128) == 0) {
            this.f14332h = new EmbeddedMessagePayload();
        } else {
            this.f14332h = embeddedMessagePayload;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmbeddedMessageElements)) {
            return false;
        }
        EmbeddedMessageElements embeddedMessageElements = (EmbeddedMessageElements) obj;
        return fa4.m11650l(this.f14325a, embeddedMessageElements.f14325a) && fa4.m11650l(this.f14326b, embeddedMessageElements.f14326b) && fa4.m11650l(this.f14327c, embeddedMessageElements.f14327c) && fa4.m11650l(this.f14328d, embeddedMessageElements.f14328d) && fa4.m11650l(this.f14329e, embeddedMessageElements.f14329e) && fa4.m11650l(this.f14330f, embeddedMessageElements.f14330f) && fa4.m11650l(this.f14331g, embeddedMessageElements.f14331g) && fa4.m11650l(this.f14332h, embeddedMessageElements.f14332h);
    }

    public final int hashCode() {
        return this.f14332h.hashCode() + ux5.m22979b(ux5.m22979b((this.f14329e.hashCode() + ux5.m22980c(ux5.m22980c(ux5.m22980c(this.f14325a.hashCode() * 31, this.f14326b, 31), this.f14327c, 31), this.f14328d, 31)) * 31, 31, this.f14330f), 31, this.f14331g);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("EmbeddedMessageElements(title=", this.f14325a, ", body=", this.f14326b, ", mediaUrl=");
        AbstractC3393o1.m17725C(sbM23000w, this.f14327c, ", mediaUrlCaption=", this.f14328d, ", defaultAction=");
        sbM23000w.append(this.f14329e);
        sbM23000w.append(", buttons=");
        sbM23000w.append(this.f14330f);
        sbM23000w.append(", text=");
        sbM23000w.append(this.f14331g);
        sbM23000w.append(", payload=");
        sbM23000w.append(this.f14332h);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }

    public EmbeddedMessageElements(String str, String str2, String str3, String str4, EmbeddedMessageAction embeddedMessageAction, List list, List list2, EmbeddedMessagePayload embeddedMessagePayload) {
        embeddedMessagePayload.getClass();
        this.f14325a = str;
        this.f14326b = str2;
        this.f14327c = str3;
        this.f14328d = str4;
        this.f14329e = embeddedMessageAction;
        this.f14330f = list;
        this.f14331g = list2;
        this.f14332h = embeddedMessagePayload;
    }
}
