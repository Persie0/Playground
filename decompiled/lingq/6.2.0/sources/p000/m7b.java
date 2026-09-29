package p000;

import com.lingq.core.database.entity.WordEntity;

/* JADX INFO: loaded from: classes.dex */
public final class m7b extends ss5 {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f50738p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ o7b f50739q;

    public /* synthetic */ m7b(o7b o7bVar, int i) {
        this.f50738p = i;
        this.f50739q = o7bVar;
    }

    @Override // p000.ss5
    /* JADX INFO: renamed from: m */
    public final void mo16668m(ik8 ik8Var, Object obj) {
        int i = this.f50738p;
        o7b o7bVar = this.f50739q;
        switch (i) {
            case 0:
                p7b p7bVar = (p7b) obj;
                ik8Var.getClass();
                p7bVar.getClass();
                ik8Var.mo2874C(1, p7bVar.m18943f());
                ik8Var.mo2874C(2, p7bVar.m18944g());
                ik8Var.mo2878j(3, p7bVar.m18938a());
                ik8Var.mo2878j(4, p7bVar.m18939b());
                ik8Var.mo2874C(5, p7bVar.m18941d());
                qn3 qn3Var = o7bVar.f53959M;
                String strM20079y = qn3Var.m20079y(p7bVar.m18942e());
                if (strM20079y == null) {
                    ik8Var.mo2880m(6);
                } else {
                    ik8Var.mo2874C(6, strM20079y);
                }
                ik8Var.mo2874C(7, qn3Var.m20080z(p7bVar.m18940c()));
                ik8Var.mo2874C(8, p7bVar.m18944g());
                break;
            default:
                WordEntity wordEntity = (WordEntity) obj;
                ik8Var.getClass();
                wordEntity.getClass();
                ik8Var.mo2874C(1, wordEntity.m7839o());
                ik8Var.mo2874C(2, wordEntity.m7838n());
                ik8Var.mo2878j(3, wordEntity.m7830f());
                String strM7836l = wordEntity.m7836l();
                if (strM7836l == null) {
                    ik8Var.mo2880m(4);
                } else {
                    ik8Var.mo2874C(4, strM7836l);
                }
                ik8Var.mo2878j(5, wordEntity.m7831g());
                ik8Var.mo2878j(6, wordEntity.m7840p() ? 1L : 0L);
                qn3 qn3Var2 = o7bVar.f53959M;
                ik8Var.mo2874C(7, qn3Var2.m20080z(wordEntity.m7833i()));
                String strM20079y2 = qn3Var2.m20079y(wordEntity.m7837m());
                if (strM20079y2 == null) {
                    ik8Var.mo2880m(8);
                } else {
                    ik8Var.mo2874C(8, strM20079y2);
                }
                String strM20079y3 = qn3Var2.m20079y(wordEntity.m7826b());
                if (strM20079y3 == null) {
                    ik8Var.mo2880m(9);
                } else {
                    ik8Var.mo2874C(9, strM20079y3);
                }
                String strM20079y4 = qn3Var2.m20079y(wordEntity.m7835k());
                if (strM20079y4 == null) {
                    ik8Var.mo2880m(10);
                } else {
                    ik8Var.mo2874C(10, strM20079y4);
                }
                String strM20079y5 = qn3Var2.m20079y(wordEntity.m7829e());
                if (strM20079y5 == null) {
                    ik8Var.mo2880m(11);
                } else {
                    ik8Var.mo2874C(11, strM20079y5);
                }
                String strM20079y6 = qn3Var2.m20079y(wordEntity.m7834j());
                if (strM20079y6 == null) {
                    ik8Var.mo2880m(12);
                } else {
                    ik8Var.mo2874C(12, strM20079y6);
                }
                String strM20079y7 = qn3Var2.m20079y(wordEntity.m7828d());
                if (strM20079y7 == null) {
                    ik8Var.mo2880m(13);
                } else {
                    ik8Var.mo2874C(13, strM20079y7);
                }
                String strM20079y8 = qn3Var2.m20079y(wordEntity.m7827c());
                if (strM20079y8 == null) {
                    ik8Var.mo2880m(14);
                } else {
                    ik8Var.mo2874C(14, strM20079y8);
                }
                String strM20079y9 = qn3Var2.m20079y(wordEntity.m7832h());
                if (strM20079y9 == null) {
                    ik8Var.mo2880m(15);
                } else {
                    ik8Var.mo2874C(15, strM20079y9);
                }
                ik8Var.mo2878j(16, wordEntity.m7825a());
                ik8Var.mo2874C(17, wordEntity.m7839o());
                break;
        }
    }

    @Override // p000.ss5
    /* JADX INFO: renamed from: s */
    public final String mo16669s() {
        switch (this.f50738p) {
            case 0:
                return "UPDATE OR ABORT `WordEntity` SET `term` = ?,`termWithLanguage` = ?,`id` = ?,`importance` = ?,`status` = ?,`tags` = ?,`meanings` = ? WHERE `termWithLanguage` = ?";
            default:
                return "UPDATE `WordEntity` SET `termWithLanguage` = ?,`term` = ?,`id` = ?,`status` = ?,`importance` = ?,`isPhrase` = ?,`meanings` = ?,`tags` = ?,`gTags` = ?,`romaji` = ?,`hiragana` = ?,`pinyin` = ?,`hant` = ?,`hans` = ?,`jyutping` = ?,`cardId` = ? WHERE `termWithLanguage` = ?";
        }
    }
}
