package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class w5a extends dha {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66433a;

    /* JADX INFO: renamed from: b */
    public boolean f66434b;

    /* JADX INFO: renamed from: c */
    public int f66435c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f66436d;

    public w5a(yua yuaVar) {
        this.f66433a = 1;
        this.f66436d = yuaVar;
        this.f66434b = false;
        this.f66435c = 0;
    }

    @Override // p000.dha, p000.zua
    /* JADX INFO: renamed from: a */
    public void mo10395a() {
        switch (this.f66433a) {
            case 0:
                this.f66434b = true;
                break;
        }
    }

    @Override // p000.dha, p000.zua
    /* JADX INFO: renamed from: b */
    public final void mo10396b() {
        int i = this.f66433a;
        Object obj = this.f66436d;
        switch (i) {
            case 0:
                ((x5a) obj).f67786a.setVisibility(0);
                break;
            default:
                if (!this.f66434b) {
                    this.f66434b = true;
                    zua zuaVar = ((yua) obj).f70520d;
                    if (zuaVar != null) {
                        zuaVar.mo10396b();
                    }
                    break;
                }
                break;
        }
    }

    @Override // p000.zua
    /* JADX INFO: renamed from: c */
    public final void mo17716c() {
        int i = this.f66433a;
        Object obj = this.f66436d;
        switch (i) {
            case 0:
                if (!this.f66434b) {
                    ((x5a) obj).f67786a.setVisibility(this.f66435c);
                }
                break;
            default:
                int i2 = this.f66435c + 1;
                this.f66435c = i2;
                yua yuaVar = (yua) obj;
                if (i2 == yuaVar.f70517a.size()) {
                    zua zuaVar = yuaVar.f70520d;
                    if (zuaVar != null) {
                        zuaVar.mo17716c();
                    }
                    this.f66435c = 0;
                    this.f66434b = false;
                    yuaVar.f70521e = false;
                }
                break;
        }
    }

    public w5a(x5a x5aVar, int i) {
        this.f66433a = 0;
        this.f66436d = x5aVar;
        this.f66435c = i;
        this.f66434b = false;
    }
}
