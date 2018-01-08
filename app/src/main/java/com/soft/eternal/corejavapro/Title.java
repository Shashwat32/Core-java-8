package com.soft.eternal.corejavapro;

/**
 * Created by singhsha on 7/12/2016.
 */

public class Title {
    private  String title;
    private long titleId;
    private Category category;
    public enum Category {Chapter , Difficulty , Mock, Statistic}

    public Title(String title, long titleId, Category category) {
        this.title = title;
        this.titleId = titleId;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public long getTitleId() {
        return titleId;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Title{" +
                "title='" + title + '\'' +
                ", titleId=" + titleId +
                ", category=" + category +
                '}';
    }

    public int getAssociatedDrawable(){
        return categoryToDrawable(category);
    }

    public static int categoryToDrawable(Category titleCategory){
        switch (titleCategory){
            case Chapter:
                return R.drawable.chapter;
            case Difficulty:
                return R.drawable.difficulty;
            case Mock:
                return R.drawable.mock;
            case Statistic:
                return R.drawable.stats;
        }
        return R.drawable.chapter;
    }
}
