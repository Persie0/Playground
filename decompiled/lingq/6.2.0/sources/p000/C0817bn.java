package p000;

import androidx.compose.runtime.AbstractC0278f;

/* JADX INFO: renamed from: bn */
/* JADX INFO: loaded from: classes.dex */
public final class C0817bn implements dh9 {

    /* JADX INFO: renamed from: a */
    public final jda f8703a;

    /* JADX INFO: renamed from: b */
    public final t66 f8704b;

    /* JADX INFO: renamed from: c */
    public AbstractC3081hn f8705c;

    /* JADX INFO: renamed from: d */
    public long f8706d;

    /* JADX INFO: renamed from: e */
    public long f8707e;

    /* JADX INFO: renamed from: f */
    public boolean f8708f;

    public C0817bn(jda jdaVar, Object obj, AbstractC3081hn abstractC3081hn, long j, long j2, boolean z) {
        AbstractC3081hn abstractC3081hnM10533i;
        this.f8703a = jdaVar;
        this.f8704b = AbstractC0278f.m1260j(obj);
        if (abstractC3081hn != null) {
            abstractC3081hnM10533i = do7.m10533i(abstractC3081hn);
        } else {
            abstractC3081hnM10533i = (AbstractC3081hn) jdaVar.f45442a.invoke(obj);
            abstractC3081hnM10533i.mo10486d();
        }
        this.f8705c = abstractC3081hnM10533i;
        this.f8706d = j;
        this.f8707e = j2;
        this.f8708f = z;
    }

    /* JADX INFO: renamed from: c */
    public final Object m3884c() {
        return this.f8703a.f45443b.invoke(this.f8705c);
    }

    @Override // p000.dh9
    public final Object getValue() {
        return ((xc9) this.f8704b).getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + ((xc9) this.f8704b).getValue() + ", velocity=" + m3884c() + ", isRunning=" + this.f8708f + ", lastFrameTimeNanos=" + this.f8706d + ", finishedTimeNanos=" + this.f8707e + ')';
    }

    public /* synthetic */ C0817bn(jda jdaVar, Object obj, AbstractC3081hn abstractC3081hn, int i) {
        this(jdaVar, obj, (i & 4) != 0 ? null : abstractC3081hn, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
