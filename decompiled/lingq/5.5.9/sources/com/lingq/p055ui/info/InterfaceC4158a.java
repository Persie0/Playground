package com.lingq.p055ui.info;

import com.lingq.shared.uimodel.library.LessonInfo;
import dm.C5207g;

/* JADX INFO: renamed from: com.lingq.ui.info.a */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC4158a {

    /* JADX INFO: renamed from: com.lingq.ui.info.a$a */
    public static final class a implements InterfaceC4158a {

        /* JADX INFO: renamed from: a */
        public static final a f27041a = new a();
    }

    /* JADX INFO: renamed from: com.lingq.ui.info.a$b */
    public static final class b implements InterfaceC4158a {

        /* JADX INFO: renamed from: a */
        public final LessonInfo f27042a;

        public b(LessonInfo lessonInfo) {
            this.f27042a = lessonInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C5207g.m11106a(this.f27042a, ((b) obj).f27042a);
        }

        public final int hashCode() {
            return this.f27042a.hashCode();
        }

        public final String toString() {
            return "DownloadLesson(lesson=" + this.f27042a + ")";
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.info.a$c */
    public static final class c implements InterfaceC4158a {

        /* JADX INFO: renamed from: a */
        public static final c f27043a = new c();
    }
}
